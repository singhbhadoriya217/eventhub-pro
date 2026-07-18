package com.eventhub.common.events.payment;

import java.math.BigDecimal;
import java.time.Instant;

public record PaymentCompletedEvent(
        String paymentId,
        String bookingId,
        String userId,
        BigDecimal amount,
        String currency,
        Instant completedAt
) {
}