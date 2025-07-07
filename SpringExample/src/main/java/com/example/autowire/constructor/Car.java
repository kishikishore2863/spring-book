package com.example.autowire.constructor;


import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    private  Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

//    public void setSpecification(Specification specification){
//        this.specification=specification;
//    }

    public void displayDetails(){
        System.out.println("Car details :"+specification.toString());
    }
}
