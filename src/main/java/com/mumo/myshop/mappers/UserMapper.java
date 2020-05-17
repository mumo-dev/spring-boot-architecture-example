package com.mumo.myshop.mappers;

import com.mumo.myshop.dto.UserDto;
import com.mumo.myshop.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User convertToEntity(UserDto userDto) {

        User user = new User();
        user.setId(userDto.getId());
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        return user;
    }

    public UserDto convertToDto(User user) {

       UserDto userDto = new UserDto()
       .setId(user.getId())
       .setEmail(user.getEmail())
       .setFirstName(user.getFirstName())
       .setLastName(user.getLastName());
       return userDto;
    }

}
