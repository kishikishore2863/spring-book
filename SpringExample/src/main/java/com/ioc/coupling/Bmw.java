package com.ioc.coupling;

public class Bmw implements Car {
    @Override
    public String engine() {
        return "diesel";
    }

    @Override
    public String body() {
        return "White";
    }

    @Override
    public String type() {
        return "suv";
    }
}
