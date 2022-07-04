package org.example.service.impl;

import lombok.AllArgsConstructor;
import org.example.dto.UserDto;
import org.example.mapper.UserMapper;
import org.example.repository.impl.UserRepositoryImpl;
import org.example.service.UserService;

@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepositoryImpl userRepository;
    private UserMapper userMapper;

    @Override
    public UserDto getUserDtoById(long userId) {
        return userMapper.mapToDto(userRepository.getUserById(userId));
    }

    @Override
    public void saveUserDto(UserDto userDto) {

    }

    @Override
    public void updateUserDto(UserDto userDto) {

    }

    @Override
    public void deleteUserDto(UserDto userDto) {

    }
}
