package Store;

import java.util.List;

public class Card {
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
}
