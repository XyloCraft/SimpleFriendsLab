package de.asedem.simplefriends.core;

import de.asedem.simplefriends.core.database.MySQL;
import de.asedem.simplefriends.core.exception.AlreadyConnectedException;
import de.asedem.simplefriends.core.repository.FriendDAO;
import de.asedem.simplefriends.core.repository.FriendRequestDAO;
import org.jetbrains.annotations.NotNull;

public class SimpleFriends {

    private static SimpleFriends instance;
    private final FriendDAO friendDAO;
    private final FriendRequestDAO friendRequestDAO;
    private MySQL mySQL = null;
    private boolean connected = false;

    /**
     * Create a new instance of SimpleFriends
     */
    public SimpleFriends() {
        this.friendDAO = new FriendDAO(this);
        this.friendRequestDAO = new FriendRequestDAO(this);
    }

    /**
     * Create a new instance of SimpleFriends
     *
     * @return the new instance
     */
    public static SimpleFriends createInstance() {
        SimpleFriends.instance = new SimpleFriends();
        return SimpleFriends.getInstance();
    }

    /**
     * Get the current instance of SimpleFriends
     *
     * @return the current instance
     */
    public static SimpleFriends getInstance() {
        return SimpleFriends.instance;
    }

    /**
     * Connect to the Database
     *
     * @param host     the host to connect to
     * @param port     the port to connect to
     * @param user     the user to connect with
     * @param password the password to connect with
     * @throws AlreadyConnectedException if the connection is already established
     */
    public void connect(@NotNull String host,int port, @NotNull String database, @NotNull String user,
                           @NotNull String password) {
        if (isConnected()) throw new AlreadyConnectedException();
        this.mySQL = new MySQL(host, port, database, user, password);
        this.createFriendRequestDatabase();
        this.connected = true;
    }

    /**
     * Disconnect from the Database
     */
    public void disconnect() {
        this.mySQL = null;
        this.connected = false;
    }

    /**
     * Check if the connection is established
     *
     * @return true if the connection is established
     */
    public boolean isConnected() {
        return connected;
    }

    /**
     * Get the MySQL instance for the friend requests
     *
     * @return the MySQL instance
     */
    public MySQL getFriendRequestDB() {
        return mySQL;
    }

    /**
     * Get the FriendDAO
     *
     * @return the FriendDAO
     */
    public FriendDAO getFriendDAO() {
        return friendDAO;
    }

    /**
     * Get the FriendRequestDAO
     *
     * @return the FriendRequestDAO
     */
    public FriendRequestDAO getFriendRequestDAO() {
        return friendRequestDAO;
    }

    private void createFriendRequestDatabase() {
        getFriendRequestDB().prepare("CREATE TABLE IF NOT EXISTS friend_requests (" +
                "sender VARCHAR(36) NOT NULL," +
                "receiver VARCHAR(36) NOT NULL," +
                "sent_at DATETIME," +
                "PRIMARY KEY (sender, receiver)" +
                ");").executeUpdateSync(false);
    }
}
