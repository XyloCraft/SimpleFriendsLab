package de.asedem.simplefriends.core.exception;

public class AlreadyConnectedException extends IllegalStateException {

    public AlreadyConnectedException() {
        super("You are already connected to the Database!");
    }
}
