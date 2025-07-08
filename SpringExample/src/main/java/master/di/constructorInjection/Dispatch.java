package master.di.constructorInjection;

public class Dispatch {
    private Payment payment;

    public Dispatch(Payment payment){
        this.payment = payment;
    }

    void displayPaymentDone(){
        System.out.println(payment.pay());
    }
}
