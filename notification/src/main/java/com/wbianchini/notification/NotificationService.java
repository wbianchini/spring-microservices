package com.wbianchini.notification;

import com.wbianchini.clients.notification.NotificationRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public record NotificationService(NotificationRepository notificationRepository) {

  public void send(NotificationRequest request) {
    notificationRepository.save(
            Notification.builder()
                    .toCustomerId(request.toCustomerId())
                    .toCustomerEmail(request.toCustomerMail())
                    .sender("com.wbianchini")
                    .message(request.message())
                    .sentAt(LocalDateTime.now())
                    .build()
    );
  }
}
