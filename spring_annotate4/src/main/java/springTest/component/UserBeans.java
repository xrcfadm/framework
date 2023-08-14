package springTest.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springTest.entity.User;

@Component
public class UserBeans {
    @Bean(name = "user")
    public User getUserBean(){
        User user = new User();
        user.setId(1);
        user.setName("admin");
        return user;
    }

    @Bean(name = "User1")
    public User getUser(){
        User user = new User();
        user.setId(2);
        user.setName("zhangsan");
        return user;
    }
}
