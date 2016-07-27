/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.api.scc.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.api.servicecontrol.v1.CheckRequest;
import com.google.api.servicecontrol.v1.Operation;
import com.google.api.servicecontrol.v1.Operation.Builder;
import com.google.common.base.Ticker;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.Timestamp;

/**
 * CheckRequestInfoTest tests the behavior of {@code CheckRequestInfo}
 */
@RunWith(JUnit4.class)
public class CheckRequestInfoTest {
  private static final String TEST_REFERER = "aReferer";
  private static final String TEST_OPERATION_NAME = "anOperationName";
  private static final String TEST_OPERATION_ID = "anOperationId";
  private static final String TEST_SERVICE_NAME = "aServiceName";
  private static FakeTicker TEST_TICKER = new FakeTicker();
  static {
    TEST_TICKER.tick(2L, TimeUnit.SECONDS);
  }
  private static Timestamp REALLY_EARLY = Timestamps.now(TEST_TICKER);
  private static final String TEST_CLIENT_IP = "127.0.0.1";
  private static final CheckRequestInfo[] INVALID_INFO = {
      new CheckRequestInfo(
          new OperationInfo().setServiceName(TEST_SERVICE_NAME).setOperationId(TEST_OPERATION_ID)),
      new CheckRequestInfo(new OperationInfo()
          .setServiceName(TEST_SERVICE_NAME)
          .setOperationName(TEST_OPERATION_NAME)),
      new CheckRequestInfo(new OperationInfo()
          .setOperationName(TEST_OPERATION_NAME)
          .setOperationId(TEST_OPERATION_ID)),};
  public static final InfoTest[] AS_CHECK_REQUEST_TEST = {
      new InfoTest(new CheckRequestInfo(newTestOperationInfo().setReferer(TEST_REFERER)),
          CheckRequest
              .newBuilder()
              .setServiceName(TEST_SERVICE_NAME)
              .setOperation(newExpectedOperationBuilder().putAllLabels(
                  ImmutableMap.of(CheckRequestInfo.SCC_USER_AGENT, KnownLabels.USER_AGENT,
                      CheckRequestInfo.SCC_REFERER, TEST_REFERER)))
              .build()),
      new InfoTest(new CheckRequestInfo(newTestOperationInfo()).setClientIp(TEST_CLIENT_IP),
          CheckRequest
              .newBuilder()
              .setServiceName(TEST_SERVICE_NAME)
              .setOperation(newExpectedOperationBuilder()
                  .putAllLabels(ImmutableMap.of(CheckRequestInfo.SCC_USER_AGENT,
                      KnownLabels.USER_AGENT, CheckRequestInfo.SCC_CALLER_IP, TEST_CLIENT_IP)))
              .build())

  };

  @Test
  public void test() {
    for (InfoTest t : AS_CHECK_REQUEST_TEST) {
      assertEquals(t.want, t.given.asCheckRequest(TEST_TICKER));
    }
  }

  @Test
  public void whenIncompleteShouldFailAsCheckRequest() {
    for (CheckRequestInfo i : INVALID_INFO) {
      try {
        i.asCheckRequest(Ticker.systemTicker());
        fail("Should have raised IllegalStateException");
      } catch (IllegalStateException e) {
        // expected
      }
    }
  }

  private static class InfoTest {
    CheckRequestInfo given;
    CheckRequest want;

    public InfoTest(CheckRequestInfo given, CheckRequest want) {
      this.given = given;
      this.want = want;
    }
  }

  private static class FakeTicker extends Ticker {
    private final AtomicLong nanos = new AtomicLong();

    /** Advances the ticker value by {@code time} in {@code timeUnit}. */
    public FakeTicker tick(long time, TimeUnit timeUnit) {
      nanos.addAndGet(timeUnit.toNanos(time));
      return this;
    }

    @Override
    public long read() {
      return nanos.getAndAdd(0);
    }
  }

  private static Builder newExpectedOperationBuilder() {
    return Operation
        .newBuilder()
        .setOperationName(TEST_OPERATION_NAME)
        .setOperationId(TEST_OPERATION_ID)
        .setEndTime(REALLY_EARLY)
        .setStartTime(REALLY_EARLY);
  }

  private static OperationInfo newTestOperationInfo() {
    return new OperationInfo()
        .setOperationId(TEST_OPERATION_ID)
        .setOperationName(TEST_OPERATION_NAME)
        .setServiceName(TEST_SERVICE_NAME);
  }
}
