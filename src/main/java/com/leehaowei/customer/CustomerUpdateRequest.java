package com.leehaowei.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
