package springTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import springTest.entity.Car;
import springTest.service.CarService;

import javax.annotation.Resource;

////1.属性注入
//@Controller
//public class CarController {
//    @Autowired
//    private CarService carService;
//
//    public void run(){
//        carService.run();
//        System.out.println("do controller");
//    }
//}

////2.setter注入
//@Controller
//public class CarController {
//    private CarService carService;
//
//    @Autowired
//    public void setCarService(CarService carService){
//        this.carService = carService;
//    }
//
//    public void run(){
//        carService.run();
//        System.out.println("do controller");
//    }
//}

////3.构造方法注入
//@Controller
//public class CarController {
//    private final CarService carService;
//
//    @Autowired
//    public CarController(CarService carService){
//        this.carService = carService;
//    }
//
//    public void run(){
//        carService.run();
//        System.out.println("do controller");
//    }
//}


////@Resource和Autowired
//@Controller
//public class CarController {
//    @Resource(name = "BenChi")   //jdk
//    private Car car;
//
//    public void run(){
//        System.out.println(car.getName());
//        System.out.println("do controller");
//    }
//}



//@Resource和Autowired
@Controller
public class CarController {
    @Autowired
    @Qualifier(value = "BenChi")
    private Car car;

    public void run(){
        System.out.println(car.getName());
        System.out.println("do controller");
    }
}