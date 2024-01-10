package de.asedem.simplefriends.core.repository;

import de.asedem.simplefriends.core.SimpleFriends;
import de.asedem.simplefriends.core.model.FriendRequestDTO;

import java.util.List;
import java.util.UUID;

public class FriendRequestDAO {

    private final SimpleFriends simpleFriends;

    public FriendRequestDAO(SimpleFriends simpleFriends) {
        this.simpleFriends = simpleFriends;
    }

    /**
     * Get all friend requests of a player
     *
     * @param sender the uuid of the player who sent the request
     * @return the friend requests
     */
    public List<FriendRequestDTO> getFriendRequestsBySender(UUID sender) {
        return null;
    }

    /**
     * Get all friend requests of a player
     *
     * @param receiver the uuid of the player who received the request
     * @return the friend requests
     */
    public List<FriendRequestDTO> getFriendRequestsByReceiver(UUID receiver) {
        return null;
    }
}
