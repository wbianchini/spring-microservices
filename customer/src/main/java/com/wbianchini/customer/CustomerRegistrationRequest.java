package com.wbianchini.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
