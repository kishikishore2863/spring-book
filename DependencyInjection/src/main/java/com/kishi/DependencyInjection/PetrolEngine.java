package com.kishi.DependencyInjection;

public class PetrolEngine implements Engine{
    @Override
    public String start() {
        return "Petrol";
    }

}
