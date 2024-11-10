package com.loose.coupling;

public class Mercedes implements Car{
    @Override
    public String engine() {
        return "petrol";
    }

    @Override
    public String body() {
        return "white";
    }

    @Override
    public String type() {
        return "sedan";
    }
}
