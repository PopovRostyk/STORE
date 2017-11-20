package Store;

public class Private24Payment implements PaymentStrategy {
    public boolean pay(double cash){
        System.out.println("Payment by Private24. Cash = "+ cash);
        return true;
    }
}
