package kz.example.finance.model.dto.api.response;

import lombok.Data;

@Data
public class FundTransferResponse {
    private String message;
    private String transactionId;
}