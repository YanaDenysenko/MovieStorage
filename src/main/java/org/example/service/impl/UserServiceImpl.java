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
    public UserDto getUserById(long userId) {
        return userMapper.mapToDto(userRepository.getUserById(userId));
    }

    @Override
    public void saveUser(UserDto userDto) {
        userRepository.saveUser(userMapper.mapToModel(userDto));
    }

    @Override
    public void updateUser(UserDto userDto) {
        userRepository.updateUser(userMapper.mapToModel(userDto));
    }

    @Override
    public void deleteUser(UserDto userDto) {
        userRepository.updateUser(userMapper.mapToModel(userDto));
    }
}
