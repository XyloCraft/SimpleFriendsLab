package de.asedem.simplefriends.core.exception;

public class AlreadyConnectedException extends RuntimeException {

    public AlreadyConnectedException() {
        super("You are already connected to the Database!");
    }
}
