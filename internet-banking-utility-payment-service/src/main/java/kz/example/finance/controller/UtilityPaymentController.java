package kz.example.finance.controller;

import kz.example.finance.model.api.request.UtilityPaymentRequest;
import kz.example.finance.model.api.response.UtilityPaymentResponse;
import kz.example.finance.model.dto.UtilityPayment;
import kz.example.finance.service.UtilityPaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/utility-payment")
public class UtilityPaymentController {

    private final UtilityPaymentService utilityPaymentService;

    @GetMapping
    public ResponseEntity<List<UtilityPayment>> readPayments(Pageable pageable) {
        return ResponseEntity.ok(utilityPaymentService.readPayments(pageable));
    }

    @PostMapping
    public ResponseEntity<UtilityPaymentResponse> processPayment(@RequestBody UtilityPaymentRequest paymentRequest) {
        return ResponseEntity.ok(utilityPaymentService.utilPayment(paymentRequest));
    }

}