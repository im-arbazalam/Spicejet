package com.example.spicejetDemo.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.AccessType;

@Entity   //for making class as entity in database
@FieldDefaults(level= AccessLevel.PRIVATE)   //for making fields as private
@Data   //contains getters and setters and required args constructor
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //auto generated
    int userId;
    String name;
    String emailId;
    int age;
}
