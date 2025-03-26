package web.dao;


import web.model.User;

import java.util.List;

public interface UserDao {

    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(Long id);

    User getUserById(Long id);

    List<User> getAllUsers();

}