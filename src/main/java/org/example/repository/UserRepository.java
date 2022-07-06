package org.example.repository;

import org.example.model.User;

public interface UserRepository {
    User getUserById(long userId);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

}
