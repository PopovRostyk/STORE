package Store;

public class Main {
    public static void main(String[] args) {
        int priceNew = 45;
        int serialNewnumber = 1111;
        Card phoneStore = new Card();
        Phone iphone = new Phone(serialNewnumber, priceNew,
                Type.SENSOR, "10", "false", "USA");
        Phone phone = new Phone(serialNewnumber, priceNew,
                Type.SENSOR, "10", "false", "UA");
        Phone samsung = new Phone(serialNewnumber, priceNew, Type.SENSOR, "s6", "false", "GB");
        phoneStore.addPhone(iphone);
        phoneStore.addPhone(phone);
        phoneStore.addPhone(samsung);
    }
}
