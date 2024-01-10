package de.asedem.simplefriends.core.model;

import java.util.UUID;

public record FriendRequestDTO(
        UUID sender,
        UUID receiver
) {
}
