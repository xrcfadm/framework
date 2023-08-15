import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.controller.UserController;
import test.controller.UserController2;
import test.controller.UserControllerXml;

//lombok的使用，以及Bean的作用域、Bean的生命周期
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
//        UserController userController = context.getBean("userController", UserController.class);
//        userController.run();
//
//        UserController2 userController2 = context.getBean("userController2", UserController2.class);
//        userController2.run();

        UserControllerXml userControllerXml = context.getBean("userControllerXml", UserControllerXml.class);
        userControllerXml.run();
        //销毁容器，以达到销毁Bean对象的目的
//        context.destroy();
    }
}
