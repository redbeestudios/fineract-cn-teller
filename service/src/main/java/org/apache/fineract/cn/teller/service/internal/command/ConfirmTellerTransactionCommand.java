/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.cn.teller.service.internal.command;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ConfirmTellerTransactionCommand {

  private String tellerTransactionIdentifier;
  private boolean chargesIncluded;

  public ConfirmTellerTransactionCommand(final String tellerTransactionIdentifier,
      final String charges) {
    super();
    this.tellerTransactionIdentifier = tellerTransactionIdentifier;
    this.chargesIncluded = charges.equalsIgnoreCase("included");
  }

  public String tellerTransactionIdentifier() {
    return this.tellerTransactionIdentifier;
  }

  public boolean chargesIncluded() {
    return this.chargesIncluded;
  }

  public String getTellerTransactionIdentifier() {
    return tellerTransactionIdentifier;
  }

  public boolean isChargesIncluded() {
    return chargesIncluded;
  }

}
