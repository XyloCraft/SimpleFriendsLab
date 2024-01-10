package de.asedem.simplefriends.core.repository;

import de.asedem.simplefriends.core.SimpleFriends;
import de.asedem.simplefriends.core.model.FriendRequestDTO;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

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
    public CompletableFuture<List<FriendRequestDTO>> getFriendRequestsBySender(UUID sender) {
        return this.simpleFriends.getFriendRequestDB()
                .prepare("SELECT * FROM friend_requests WHERE sender=?", sender.toString())
                .query(FriendRequestDTO.class)
                .get();
    }

    /**
     * Get all friend requests of a player
     *
     * @param receiver the uuid of the player who received the request
     * @return the friend requests
     */
    public CompletableFuture<List<FriendRequestDTO>> getFriendRequestsByReceiver(UUID receiver) {
        return this.simpleFriends.getFriendRequestDB()
                .prepare("SELECT * FROM friend_requests WHERE receiver=?", receiver.toString())
                .query(FriendRequestDTO.class)
                .get();
    }
}
