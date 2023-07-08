import com.spring.bean.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TeacherMain {
    public static void main(String[] args) {
        // 懒汉加载：调用时，才加载spring容器中的bean对象，效率不高，但是内存消耗低。
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));

        Student student = (Student) factory.getBean("student");

        student.wmi();
    }
}
