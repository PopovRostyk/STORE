package Store;

import java.util.*;

public class Customer extends User {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Card has new item to buy: " + arg.toString());
    }
}
