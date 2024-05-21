package com.group12.vibeshotel.exception;

/**
 * @author nganhthu
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
