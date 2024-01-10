package de.asedem.simplefriends.core.repository;

import de.asedem.simplefriends.core.SimpleFriends;

import java.util.List;
import java.util.UUID;

public class FriendDAO {

    private final SimpleFriends simpleFriends;

    public FriendDAO(SimpleFriends simpleFriends) {
        this.simpleFriends = simpleFriends;
    }

    /**
     * Get the friends of a player
     *
     * @param uuid the uuid of the player
     * @return the uuids owned by the friends of the player
     */
    public List<UUID> getFriends(UUID uuid) {
        return null;
    }

    /**
     * Add a friend to a player
     *
     * @param uuid   the uuid of the player
     * @param friend the uuid of the friend
     */
    public void addFriend(UUID uuid, UUID friend) {

    }

    /**
     * Remove a friend from a player
     *
     * @param uuid   the uuid of the player
     * @param friend the uuid of the friend
     */
    public void removeFriend(UUID uuid, UUID friend) {

    }

    /**
     * Check if a player is a friend of another player
     *
     * @param uuid   the uuid of the player
     * @param friend the uuid of the friend
     * @return true if the player is a friend of the other player
     */
    public boolean isFriend(UUID uuid, UUID friend) {
        return false;
    }
}
