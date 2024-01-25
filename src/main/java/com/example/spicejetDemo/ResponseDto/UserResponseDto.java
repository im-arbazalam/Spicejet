package com.example.spicejetDemo.ResponseDto;

import lombok.Builder;

@Builder
public class UserResponseDto {
    private String name;
    private int age;
    private String emailId;
    private String statusCode;
    private String statusMessage;
}
