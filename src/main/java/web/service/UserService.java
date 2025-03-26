package web.service;


import web.model.User;

import java.util.List;


public interface UserService {

    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(Long id);

    User getUserById(Long id);

    List<User> getAllUsers();
}