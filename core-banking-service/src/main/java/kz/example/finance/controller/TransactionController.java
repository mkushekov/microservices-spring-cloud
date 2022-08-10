package kz.example.finance.controller;

import kz.example.finance.model.api.request.FundTransferRequest;
import kz.example.finance.model.api.request.UtilityPaymentRequest;
import kz.example.finance.model.api.response.FundTransferResponse;
import kz.example.finance.model.api.response.UtilityPaymentResponse;
import kz.example.finance.service.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/transaction")
public class TransactionController {
    private final TransactionService transactionService;

    @PostMapping("/fund-transfer")
    public ResponseEntity<FundTransferResponse> fundTransfer(@RequestBody FundTransferRequest fundTransferRequest) {
        log.info("Fund transfer initiated in core bank from {}", fundTransferRequest.toString());
        return ResponseEntity.ok(transactionService.fundTransfer(fundTransferRequest));

    }

    @PostMapping("/util-payment")
    public ResponseEntity<UtilityPaymentResponse> utilPayment(@RequestBody UtilityPaymentRequest utilityPaymentRequest) {
        log.info("Utility Payment initiated in core bank from {}", utilityPaymentRequest.toString());
        return ResponseEntity.ok(transactionService.utilPayment(utilityPaymentRequest));

    }

}
