package master.di.constructorInjection;

public class Credit implements Payment{
    @Override
    public String pay() {
        return "payment through Credit";
    }
}
