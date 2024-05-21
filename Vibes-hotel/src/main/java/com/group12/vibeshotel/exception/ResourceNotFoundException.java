package com.group12.vibeshotel.exception;

/**
 * @author nganhthu
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
