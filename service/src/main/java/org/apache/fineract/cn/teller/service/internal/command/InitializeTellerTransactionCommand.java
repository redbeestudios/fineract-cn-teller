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

import org.apache.fineract.cn.teller.api.v1.domain.TellerTransaction;

public class InitializeTellerTransactionCommand {
  private String tellerCode;
  private TellerTransaction tellerTransaction;

  public InitializeTellerTransactionCommand(final String tellerCode, final TellerTransaction tellerTransaction) {
    super();
    this.tellerCode = tellerCode;
    this.tellerTransaction = tellerTransaction;
  }

  public InitializeTellerTransactionCommand(){}

  public String tellerCode() {
    return this.tellerCode;
  }

  public TellerTransaction tellerTransaction() {
    return this.tellerTransaction;
  }


  public String getTellerCode() {
    return tellerCode;
  }

  public TellerTransaction getTellerTransaction() {
    return tellerTransaction;
  }

}
