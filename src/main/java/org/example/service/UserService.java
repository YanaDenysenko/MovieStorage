package org.example.service;

import org.example.dto.UserDto;

public interface UserService {
    UserDto getUserById(long userId);

    void saveUser(UserDto userDto);

    void updateUser(UserDto userDto);

    void deleteUser(UserDto userDto);
}
