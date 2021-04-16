package com.microservice.api.user.repository;

import com.microservice.api.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByDniAndPassword(String dni, String pass);

}
