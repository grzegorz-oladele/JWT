package pl.grzegorz.JWT.service;

import pl.grzegorz.JWT.model.Role;
import pl.grzegorz.JWT.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
