package org.fkg.springboot.hello.service;

import javax.annotation.Resource;

import org.fkg.springboot.hello.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    
    @Resource
    private UserRepository userRepository;

    public String getAllUsers() {
        // TODO Auto-generated method stub
        return userRepository.getUsers();
    }

}
