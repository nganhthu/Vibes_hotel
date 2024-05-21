package com.group12.vibeshotel.service;

import com.group12.vibeshotel.model.Role;
import com.group12.vibeshotel.model.User;

import java.util.List;

/**
 * @author nganhthu
 */

public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}
