package Store;

public class BonusDecorator extends CardDecorator {

    public BonusDecorator(Card card) {
        super(card);
    }
    public boolean ship(){
        getDecorateCard().setPhonesList(new Phone(2404, 1500, Type.BUTTONS, "Samsung", "new", "USA"));
        return getDecorateCard().ship();
    }
}
