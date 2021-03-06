/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wasp.session;

import org.apache.wasp.ReadModel;
import org.apache.wasp.client.FClient;
import org.apache.wasp.jdbc.command.CommandInterface;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class QuerySession implements SessionInterface {

  private String sessionId;

  private AtomicInteger nextId = new AtomicInteger();

  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public int getNextId() {
    return nextId.incrementAndGet();
  }

  public int getCurrentId() {
    return nextId.get();
  }

  @Override
  public void close() throws IOException {
    // To change body of implemented methods use File | Settings | File
    // Templates.
  }

  @Override
  public boolean isClosed() {
    return false; // To change body of implemented methods use File | Settings |
                  // File Templates.
  }

  @Override
  public CommandInterface prepareCommand(FClient fClient, String sql,
      int fetchSize, ReadModel readModel) {
    return null; // To change body of implemented methods use File | Settings |
                 // File Templates.
  }

  @Override
  public void afterWriting() {
    // To change body of implemented methods use File | Settings | File
    // Templates.
  }

  public void checkClosed() {
    // OK
  }
}
