package com.eventhub.common.events.booking;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

public record BookingCreatedEvent(
        String bookingId,
        String userId,
        String eventId,
        List<String> seatIds,
        BigDecimal totalAmount,
        Instant createdAt
) {
}