package com.group12.vibeshotel.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author nganhthu
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
