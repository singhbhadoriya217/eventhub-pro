package com.eventhub.common.events.notification;

import java.time.Instant;

public record NotificationEvent(
        String userId,
        String recipient,
        String type,
        String subject,
        String message,
        Instant createdAt
) {
}