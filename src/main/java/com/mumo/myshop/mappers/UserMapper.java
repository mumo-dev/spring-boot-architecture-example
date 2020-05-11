package com.mumo.myshop.mappers;

import com.mumo.myshop.dto.UserDto;
import com.mumo.myshop.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User convertToEntity(UserDto userDto) {

        User user = new User();
        user.setId(userDto.id());
        user.setEmail(userDto.email());
        user.setFirstName(userDto.firstName());
        user.setLastName(userDto.lastName());
        return user;
    }

    public UserDto convertToDto(User user) {

       UserDto userDto = new UserDto()
       .id(user.getId())
       .email(user.getEmail())
       .firstName(user.getFirstName())
       .lastName(user.getLastName());
       return userDto;
    }

}
