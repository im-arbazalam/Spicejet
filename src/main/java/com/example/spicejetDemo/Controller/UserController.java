package com.example.spicejetDemo.Controller;


import com.example.spicejetDemo.Exception.EmailIsAlreadyPresent;
import com.example.spicejetDemo.Exception.EmailShouldNotNullException;
import com.example.spicejetDemo.RequestDto.AddUserDto;
import com.example.spicejetDemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody AddUserDto addUserDto) throws EmailShouldNotNullException, EmailIsAlreadyPresent
    {
        try {
            String result=service.addUser(addUserDto);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        }catch (Exception E){
            return new ResponseEntity<>(E.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

}
