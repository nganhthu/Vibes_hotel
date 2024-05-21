package com.group12.vibeshotel.service;

import com.group12.vibeshotel.model.User;
import java.util.List;

/**
 * @author nganhthu
 */

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
