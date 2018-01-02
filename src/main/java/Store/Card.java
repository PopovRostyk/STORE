package Store;

import java.util.*;

public class Card extends Observable{
    private List<Phone> phonesList;
    private PaymentStrategy paymentStrategy;
    private DeliveryStrategy deliveryStrategy;
    public Card(){
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

    public void addPhone(Phone phone){
        this.phonesList.add(phone);
        setChanged();
        notifyObservers();
    }
    private List<Phone> getPhones(){
        return this.phonesList;
    }
}
