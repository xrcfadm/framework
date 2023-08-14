import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springTest.controller.UserController;
import springTest.entity.User;

//小练习：在main中获取到Controller，在Controller中通过注入方式获取Service
// 在Service中通过注入方式获取Repository,在Repository中获取到User对象，并逐层返回给main并打印。
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserController userController = context.getBean("userController", UserController.class);
        User user = userController.getUser();
        System.out.println("main:"+user.toString());
    }
}
