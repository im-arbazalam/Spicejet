package com.example.spicejetDemo.Repository;

import com.example.spicejetDemo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
  //  Optional<User> findByEmailId(String emailId);
   User  findByEmailId(String emailId);
}
