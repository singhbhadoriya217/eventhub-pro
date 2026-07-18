package com.eventhub.common.events.user;

import java.time.Instant;

public record UserRegisteredEvent(
        String userId,
        String email,
        String name,
        Instant registeredAt
) {
}