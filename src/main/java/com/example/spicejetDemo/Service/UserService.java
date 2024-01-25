package com.example.spicejetDemo.Service;

import com.example.spicejetDemo.Exception.EmailIsAlreadyPresent;
import com.example.spicejetDemo.Exception.EmailShouldNotNullException;
import com.example.spicejetDemo.Model.User;
import com.example.spicejetDemo.Repository.UserRepository;
import com.example.spicejetDemo.RequestDto.AddUserDto;
import com.example.spicejetDemo.Transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public String addUser(AddUserDto user) throws EmailShouldNotNullException, EmailIsAlreadyPresent {

        if(user.getEmailId()==null){
            throw new EmailShouldNotNullException("Email should not be null");
        }

//    Optional<User>optionalUser=  repository.findByEmailId(user.getEmailId());
//
//        if(optionalUser.isEmpty()) {
//        throw new EmailIsAlreadyPresent("Email is Already Present");
//    }

        User user1= UserTransformer.ConvertDtoToEntity(user);
        repository.save(user1);
        return "User Saved Successfully";
    }

}
