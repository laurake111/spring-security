package com.example.springsecuritydemo.model;

import lombok.Data;

@Data
public class AuthenticationResponse {
    private final String jwt;
}
