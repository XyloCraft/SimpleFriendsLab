package de.asedem.simplefriends.core.model;

import java.time.LocalDateTime;
import java.util.UUID;

public record FriendRequestDTO(
        UUID sender,
        UUID receiver,
        LocalDateTime sent_at
) {
}
