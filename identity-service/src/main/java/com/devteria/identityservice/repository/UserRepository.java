package com.devteria.identityservice.repository;

import com.devteria.identityservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//là class tương tác với dbms, đây là jpa
public interface UserRepository extends JpaRepository<User, String> {
    boolean existsByUsername(String username);
}
