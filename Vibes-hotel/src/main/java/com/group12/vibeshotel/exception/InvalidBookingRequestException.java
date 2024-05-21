package com.group12.vibeshotel.exception;

/**
 * @author nganhthu
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}