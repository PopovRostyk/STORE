package Store;

import java.util.*;

public class Seller extends User{
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Cart has new item to sell: " + arg.toString());
    }
}
