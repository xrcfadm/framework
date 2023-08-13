import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springTest.controller.TestController;


//JavaEE标准分层
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        TestController testController = context.getBean("testController", TestController.class);
        System.out.println(testController.toString());
    }
}