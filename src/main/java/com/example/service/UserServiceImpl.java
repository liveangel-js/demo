package com.example.service;

import com.example.dao.RoleRepository;
import com.example.dao.UserRepository;
import com.example.model.Role;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        if(user.getRoles()==null || user.getRoles().isEmpty()){
            Set<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("User"));
            user.setRoles(roles);
        }
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
