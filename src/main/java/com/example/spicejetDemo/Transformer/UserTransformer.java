package com.example.spicejetDemo.Transformer;

import com.example.spicejetDemo.Model.User;
import com.example.spicejetDemo.RequestDto.AddUserDto;
import com.example.spicejetDemo.ResponseDto.UserResponseDto;

public class UserTransformer {

    public static User ConvertDtoToEntity (AddUserDto addUserDto){
        User user= User.builder()
                .emailId(addUserDto.getEmailId())
                .name(addUserDto.getName())
                .age(addUserDto.getAge())
                .build();
        return user;
    }
    public static UserResponseDto ConvertEntityToDto(User user){
        return UserResponseDto.builder()
                .age(user.getAge())
                .name(user.getName())
                .emailId(user.getEmailId())
                .build();
    }


}

