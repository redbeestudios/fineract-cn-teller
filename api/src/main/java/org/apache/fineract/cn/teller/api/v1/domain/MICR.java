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
package org.apache.fineract.cn.teller.api.v1.domain;

import org.apache.fineract.cn.lang.validation.constraints.ValidIdentifier;

public class MICR {
  @ValidIdentifier(maxLength = 8)
  private String chequeNumber;
  @ValidIdentifier(maxLength = 11)
  private String branchSortCode;
  @ValidIdentifier(maxLength = 350)
  private String accountNumber;

  public MICR() {
    super();
  }

  public String getChequeNumber() {
    return this.chequeNumber;
  }

  public void setChequeNumber(final String chequeNumber) {
    this.chequeNumber = chequeNumber;
  }

  public String getBranchSortCode() {
    return this.branchSortCode;
  }

  public void setBranchSortCode(final String branchSortCode) {
    this.branchSortCode = branchSortCode;
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }

  public void setAccountNumber(final String accountNumber) {
    this.accountNumber = accountNumber;
  }
}
