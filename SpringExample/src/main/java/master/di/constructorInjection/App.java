package master.di.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationMasterDiConstructorInjection.xml");
        Dispatch dispatch = (Dispatch) context.getBean("dispatch");
        dispatch.displayPaymentDone();
    }
}
