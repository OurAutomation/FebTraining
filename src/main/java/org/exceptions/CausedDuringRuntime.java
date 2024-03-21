package org.exceptions;

public class CausedDuringRuntime extends RuntimeException {
    public CausedDuringRuntime(String message) {
        super(message);
    }
}
