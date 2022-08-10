package kz.example.finance.model.dto;

import kz.example.finance.model.Status;
import lombok.Data;

@Data
public class User {
    private Long id;

    private String email;

    private String identification;

    private String password;

    private String authId;

    private Status status;
}
