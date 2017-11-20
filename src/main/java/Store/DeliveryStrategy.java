package Store;

import java.util.*;

public interface DeliveryStrategy {
    boolean deliver(List<Phone> phones);
}