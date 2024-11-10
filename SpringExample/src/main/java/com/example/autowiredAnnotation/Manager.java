package com.example.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("manager")
public class Manager {
    @Autowired
    @Qualifier("employee")
    private Employee employee;

//@Autowired
    public Manager(Employee employee){
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
