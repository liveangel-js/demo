package com.example.dao;

/**
 * Created by liveangel on 2016-10-20.
 */

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}