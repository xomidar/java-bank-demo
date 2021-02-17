package com.brainstation23.bank.controller;

import com.brainstation23.bank.domain.ActionCommand;
import com.brainstation23.bank.domain.BankAction;
import com.brainstation23.bank.domain.request.BankRequest;
import com.brainstation23.bank.domain.response.BankResponse;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController implements BankApi {

  @Override
  public ResponseEntity<List<BankResponse>> getBanks(String code) {
    return null;
  }

  @Override
  public ResponseEntity<BankResponse> getBank(Long bankId) {
    return null;
  }

  @Override
  public ResponseEntity<BankResponse> addBank(BankRequest bankRequest) {
    return null;
  }

  @Override
  public ResponseEntity<BankResponse> updateBank(Long bankId, BankRequest bankRequest) {
    return null;
  }

  @Override
  public ResponseEntity<Void> removeBank(Long bankId) {
    return null;
  }

  @Override
  public ResponseEntity<Void> bankCommand(Long bankId, ActionCommand<BankAction, ?> command) {
    return null;
  }
}
