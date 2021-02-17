package com.brainstation23.bank.domain.request;

import lombok.Value;

/**
 * Date of creation 16-Feb-2021
 *
 * @author Md. Rezaul Hasan
 * @since 0.0.1
 */
@Value
public class BankRequest {

  private String name;
  private String code;
  private String address;
  private String centralBankCode;
  private String swiftCode;
  private boolean ownBank;
}
