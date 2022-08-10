package kz.example.finance.model.dto;

import kz.example.finance.model.Status;
import lombok.Data;

@Data
public class UserUpdateRequest {
    private Status status;
}
