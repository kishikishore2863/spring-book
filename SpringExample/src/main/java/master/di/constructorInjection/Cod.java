package master.di.constructorInjection;

public class Cod implements Payment{

    @Override
    public String pay() {
        return "Payment done through Cod";
    }
}
