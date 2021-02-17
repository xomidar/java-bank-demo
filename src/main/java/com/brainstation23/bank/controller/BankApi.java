package com.brainstation23.bank.controller;

import com.brainstation23.bank.domain.ActionCommand;
import com.brainstation23.bank.domain.BankAction;
import com.brainstation23.bank.domain.BrainStation23MediaType;
import com.brainstation23.bank.domain.request.BankRequest;
import com.brainstation23.bank.domain.response.BankResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(value = "banks", tags = "banks")
@RequestMapping(path = "banks", produces = BrainStation23MediaType.APPLICATION_JSON_VALUE_V1)
public interface BankApi {

  @ApiOperation(
      value = "Get All Banks",
      nickname = "getBanks",
      tags = {
        "banks",
      })
  @GetMapping
  ResponseEntity<List<BankResponse>> getBanks(
      @RequestParam(value = "code", required = false) String code);

  @ApiOperation(
      value = "Get Bank",
      nickname = "getBank",
      tags = {
        "banks",
      })
  @GetMapping(path = "{bankId}")
  ResponseEntity<BankResponse> getBank(
      @ApiParam(value = "bankId") @PathVariable("bankId") Long bankId);

  @ApiOperation(
      value = "Add Bank",
      nickname = "addBank",
      tags = {
        "banks",
      })
  @PostMapping(consumes = BrainStation23MediaType.APPLICATION_JSON_VALUE_V1)
  ResponseEntity<BankResponse> addBank(@RequestBody BankRequest bankRequest);

  @ApiOperation(
      value = "Update Bank",
      nickname = "updateBank",
      tags = {
        "banks",
      })
  @PutMapping(path = "{bankId}", consumes = BrainStation23MediaType.APPLICATION_JSON_VALUE_V1)
  ResponseEntity<BankResponse> updateBank(
      @PathVariable("bankId") Long bankId, @RequestBody BankRequest bankRequest);

  @ApiOperation(
      value = "Remove Bank",
      nickname = "removeBank",
      tags = {
        "banks",
      })
  @DeleteMapping(path = "{bankId}")
  ResponseEntity<Void> removeBank(@PathVariable("bankId") Long bankId);

  @PutMapping(
      path = "{bankId}/command",
      consumes = BrainStation23MediaType.APPLICATION_JSON_VALUE_V1)
  ResponseEntity<Void> bankCommand(
      @PathVariable("bankId") Long bankId, @RequestBody ActionCommand<BankAction, ?> command);
}
