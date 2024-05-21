package com.group12.vibeshotel.exception;

/**
 * @author nganhthu
 */

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}
