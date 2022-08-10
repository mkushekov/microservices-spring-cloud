package kz.example.finance.model.api.response;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class UtilityPaymentResponse {
    private String message;
    private String transactionId;
}