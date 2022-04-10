package com.wbianchini.clients.notification;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerMail,
        String message
) {
}
