import com.spring.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        // 饿汉加载：一次性加载，后续操作spring容器中的bean对象时会很快，但是费内存。
        // 1通过resources文件夹中的xml文件名，获取spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // 法一：通过名称获取
        // 通过bean的名字，从spring容器中获取spring bean对象
        Student student = (Student) context.getBean("student");
        // 法二：通过类获取(易错点：当spring容器中同一个bean存多次，使用类型获取bean的方式就会出错)
        Student student1 = context.getBean(Student.class);
        // 法三：通过名称+类
        Student student2 = context.getBean("student", Student.class);

        // 3使用spring bean对象
        student.wmi();
    }
}
