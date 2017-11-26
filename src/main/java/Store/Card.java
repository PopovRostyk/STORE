package Store;

import java.util.List;

public class Card extends Observable{
    private List<Phone> phonesList;
    private PaymentStrategy paymentStrategy;
    private DeliveryStrategy deliveryStrategy;
    public Card(PaymentStrategy paymentStrategy, DeliveryStrategy deliveryStrategy){
        this.paymentStrategy = paymentStrategy;
        this.deliveryStrategy = deliveryStrategy;
    }
    public boolean pay(double cash){
        return paymentStrategy.pay(cash);
    }
    public boolean ship(){
        return deliveryStrategy.deliver(phonesList);
    }

    public void setPhonesList(Phone phone) {
        this.phonesList.add(phone);
    }

    public List<Phone> getPhonesList() {
        return phonesList;
    }

    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public void removeObserver(Observer o) {
        super.removeObserver(o);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }
}
