package com.example.spicejetDemo.RequestDto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class AddUserDto {

    private String name;
    private int age;
    private String emailId;

}
