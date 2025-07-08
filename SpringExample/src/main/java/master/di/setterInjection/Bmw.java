package master.di.setterInjection;

public class Bmw implements Car{
    @Override
    public void register() {
        System.out.println("registered bmw");
    }
}
