package Store;

public class Customer extends User {
    private int money;

    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney(){
        return this.money;
    }

    @Override
    public void update(){
        System.out.println("This customer has " + money + " $.");
    }
}
