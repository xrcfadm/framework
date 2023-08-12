import com.spring.demo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//使用五大类注解存储Bean对象到spring中，使用基本方式从spring容器中获取Bean对象。
public class App {
    public static void main(String[] args) {
        //1获取spring对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //2获取bean对象
        Student student = context.getBean("student", Student.class);
        //注意：默认情况下原类名首字母小写获取bean，【特例】若原类名的首字母和次首字母均大写，就使用原类名获取bean即可。
        //3使用bean对象
        student.wmi();
    }
}
