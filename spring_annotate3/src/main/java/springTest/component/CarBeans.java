package springTest.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springTest.entity.Car;

// 注意1：Bean的命名规则默认是使用方法名获取，但可以修改Bean的名称(在@Bean后加括号使用name或value进行重命名)
// 注意2：方法注解@Bean需要配合五大类注解使用(根本原因就是为了提高性能)。
@Component
public class CarBeans {
    // 注意：使用方法注解 @Bean 存储对象到 spring容器
    @Bean(name = {"BenChi"})
    public Car getBenChiCar(){
        Car car = new Car();
        car.setName("奔驰");
        car.setValue("20w");
        return car;
    }
    @Bean(name = "AoDi")
    public Car getAoDiCar(){
        Car car = new Car();
        car.setName("奥迪");
        car.setValue("30w");
        return car;
    }
}
