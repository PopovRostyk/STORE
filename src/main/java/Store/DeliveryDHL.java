package Store;

import java.util.*;

public class DeliveryDHL implements DeliveryStrategy {
    @Override
    public boolean deliver(List<Phone> phones) {
        System.out.println("delivered by DHL");
        return true;
    }
}
