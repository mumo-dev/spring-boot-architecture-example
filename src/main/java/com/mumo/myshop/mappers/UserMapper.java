package com.mumo.myshop.mappers;


import com.mumo.myshop.dto.UserDto;
import com.mumo.myshop.models.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {


    @Autowired
    private ModelMapper modelMapper;

    public   User convertToEntity(UserDto userDto) {

         return  modelMapper.map(userDto, User.class);
    }


    public   UserDto convertToDto(User user) {

        return  modelMapper.map(user, UserDto.class);
    }

}
