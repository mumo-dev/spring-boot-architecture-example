package com.mumo.myshop.controller;

import com.mumo.myshop.dto.UserDto;
import com.mumo.myshop.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/users")
public class UserController {

    private final UserService userService;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto) {
        return  userService.createUser(userDto);
    }


    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }


    @PutMapping("/{id}")
    public UserDto updateUsers(@RequestBody UserDto userDto) {
        return userService.updateUser(userDto);
    }
}
