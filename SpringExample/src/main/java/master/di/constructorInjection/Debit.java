package master.di.constructorInjection;

public class Debit implements Payment {

    @Override
    public String pay() {
        return "payment done through Debit";
    }
}
