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
    public UserDto getById(long id) {
        return userMapper.mapToDto(userRepository.getById(id));
    }
}
