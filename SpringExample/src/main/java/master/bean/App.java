package master.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationMasterBean.xml");
        System.out.println("---- Registered Beans ----");
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);
    }
}
