package test.conponent;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import test.entity.User;

@Component
public class UserBeans {
    @Bean(name = "User")
//    法一：@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    法二：@Scope("prototype")
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setName("admin");
        return user;
    }
}
