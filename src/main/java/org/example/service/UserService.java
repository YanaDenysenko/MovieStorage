package org.example.service;

import org.example.dto.UserDto;

public interface UserService {
    UserDto getUserDtoById(long userId);

    void saveUserDto(UserDto userDto);

    void updateUserDto(UserDto userDto);

    void deleteUserDto(UserDto userDto);
}
