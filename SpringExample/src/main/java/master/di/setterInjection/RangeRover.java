package master.di.setterInjection;

public class RangeRover implements Car {

    @Override
    public void register() {
        System.out.println("registered RangeRover");
    }
}