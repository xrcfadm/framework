package springTest.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import springTest.entity.User;

@Repository
public class UserRepository {
    @Autowired
    private User user;

    public User getUser(){
        System.out.println("do Repository");
        return this.user;
    }
}
