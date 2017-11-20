package Store;


public class DiscountDecorator extends CardDecorator{
    public DiscountDecorator(Card card) {
        super(card);
    }
    public double computeTotalPrice(){
        int price = 0;
        for (Phone phone : getDecorateCard().getPhonesList()) {
            price += phone.getPrice();
        }
        return price * 0.8;
    }
}
