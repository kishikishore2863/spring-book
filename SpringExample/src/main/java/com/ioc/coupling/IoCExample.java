package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCExample {
    public static void main(String[] args) {
        ApplicationContext context
                =new ClassPathXmlApplicationContext("applicationIoClLooseCouplingExample.xml");

        UserManager userManagerWithDB =(UserManager) context.getBean("userManagerWithDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());
    }
}
