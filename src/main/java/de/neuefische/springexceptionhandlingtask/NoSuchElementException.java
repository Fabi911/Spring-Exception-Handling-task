package de.neuefische.springexceptionhandlingtask;

public class NoSuchElementException extends RuntimeException {
    public NoSuchElementException(String message) {
        super(message);
    }
}
