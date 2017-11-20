package Store;

import java.util.*;

public class DeliveryNovaPoshta implements DeliveryStrategy {
    public boolean deliver(List<Phone> phones) {
        System.out.println("Delivered by Nova Poshta");
        return true;
    }
}
