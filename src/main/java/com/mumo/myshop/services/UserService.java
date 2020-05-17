package com.mumo.myshop.services;

import com.mumo.myshop.dto.UserDto;
import com.mumo.myshop.exceptions.ResourceNotFoundException;
import com.mumo.myshop.mappers.UserMapper;
import com.mumo.myshop.models.User;
import com.mumo.myshop.repository.UserRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;


    public UserDto createUser(UserDto userDto) {
        User user = convertToEntity(userDto);
        return  convertToDto(userRepository.save(user));
    }

    public UserDto updateUser(UserDto userDto) {
       User userExists =  userRepository.findById(userDto.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User with id " + userDto + " Not Found"));

        User user = convertToEntity(userDto);
        return  convertToDto(userRepository.save(user));
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }


    public List<UserDto> getAllUsers() {
        return  userRepository.findAll()
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());

    }

    private UserDto convertToDto(User user) {
        return userMapper.convertToDto(user);
    }

    private User convertToEntity(UserDto userDto) {
        return userMapper.convertToEntity(userDto);
    }

}