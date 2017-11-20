package Store;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class Inventory {
    private List<Phone> phones;
    public Inventory() {
        phones = new LinkedList();
    }
    public void addPhone(int serialNumber, double price, Spec spec) {
        Phone phone = new Phone(serialNumber, price, spec);
        phones.add(phone);
    }
    public Phone getPhone(int serialNumber) {
        for (Iterator phoneIterator = phones.iterator();
             phoneIterator.hasNext();) {
            Phone phone = (Phone) phoneIterator.next();
            if (phone.getSerialNumber() == serialNumber) {
                return phone;
            }
        }
        return null;
    }
    public List search(Phone searchPhone) {
        List mathcingGuitars = new LinkedList();
        for (Iterator phoneIterator = phones.iterator();
             phoneIterator.hasNext();) {
            Phone phone = (Phone) phoneIterator.next();
            if (!(phone.getSpecs().isEqual(searchPhone.getSpecs()))) {
                continue;
            }
            mathcingGuitars.add(phone);
        }
        return mathcingGuitars;
    }
    public List getPhones() {
        return this.phones;
    }

    @Override
    public String toString() {
        return "Inventory{"
                + "phones="
                + phones
                + '}';
    }
}