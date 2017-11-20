package Store;

public class CashPayment implements PaymentStrategy {
    public boolean pay(double cash){
        System.out.println("Payment by cash. Cash = "+ cash);
        return true;
    }
}
