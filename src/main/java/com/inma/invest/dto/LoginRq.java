package com.inma.invest.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class LoginRq {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    
}
