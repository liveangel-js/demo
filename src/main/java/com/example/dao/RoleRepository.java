package com.example.dao;

/**
 * Created by liveangel on 2016-10-20.
 */
import com.example.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Role findByName(String name);
}
