package master.di.setterInjection;

public class ShowRoom {
    private Car car;//create dependent object to target class

    public void setCar(Car car) {
        this.car = car;
    }

    void display(){
        car.register();
    }
}