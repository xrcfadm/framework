import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springTest.controller.CarController;
import springTest.entity.Car;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        //1.方法注解演示，取Bean时，使用修改后的名称
//        Car car = context.getBean("AoDi", Car.class);
//        System.out.println(car.toString());

        //2.依赖注入的三种方式
        CarController controller = context.getBean("carController", CarController.class);
        controller.run();
    }
}
