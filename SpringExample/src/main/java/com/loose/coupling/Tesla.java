package com.loose.coupling;

public class Tesla implements Car{
    @Override
    public String engine() {
        return "ev";
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
