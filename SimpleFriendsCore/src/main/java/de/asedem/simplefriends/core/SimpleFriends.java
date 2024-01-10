package de.asedem.simplefriends.core;

import de.asedem.simplefriends.core.exception.AlreadyConnectedException;

public class SimpleFriends {

    private static SimpleFriends instance;

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
     * @throws AlreadyConnectedException if the connection is already established
     *
     * @param host the host to connect to
     * @param port the port to connect to
     * @param user the user to connect with
     * @param password the password to connect with
     * @return true if the connection was successful
     */
    public boolean connect(String host, int port, String user, String password) {
        if (isConnected()) throw new AlreadyConnectedException();
        return false;
    }

    /**
     * Disconnect from the Database
     *
     * @return true if the disconnect was successful
     */
    public boolean disconnect(){
        return false;
    }

    /**
     * Check if the connection is established
     *
     * @return true if the connection is established
     */
    public boolean isConnected(){
        return false;
    }
}
