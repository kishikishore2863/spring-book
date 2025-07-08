package master.di.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appliactionMasterDiSetterInjection.xml");
        ShowRoom showRoom = (ShowRoom) context.getBean("showRoom");
        showRoom.display();
    }
}
