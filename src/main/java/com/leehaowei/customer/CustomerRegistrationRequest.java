package com.leehaowei.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age
) {
}
