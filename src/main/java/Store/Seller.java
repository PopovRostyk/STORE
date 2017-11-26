package Store;

public class Seller extends User{
    private int money;
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    @Override
    public void update(){
        System.out.println("This seller received " + money + " $.");
    }
}
