package springTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springTest.entity.User;
import springTest.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(){
        System.out.println("do UserService");
        return userRepository.getUser();
    }
}
