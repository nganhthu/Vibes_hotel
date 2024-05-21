package com.group12.vibeshotel.exception;

/**
 * @author nganhthu
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
