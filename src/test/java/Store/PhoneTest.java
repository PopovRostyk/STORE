package Store;

import Store.Phone;
import Store.Spec;
import Store.Type;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneTest {
    @Test
    public void testtoString()  {
        String msg = "Phone{serialNumber=1111, price=45.0, specs=Spec{type=Sensor, model='10', used=false, country='USA'}}";
        Phone iphone = new Phone(1111, 45, new Spec(Type.SENSOR, "10", "false", "USA"));
        assertEquals(msg, iphone.toString());
    }

    private Phone iphone = new Phone(1111, 45, new Spec(Type.SENSOR, "10", "false", "USA"));
    @Test
    public void getSerialNumber() throws Exception {
        assertEquals(1111, iphone.getSerialNumber(), 0.1);
    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(45, iphone.getPrice(), 0.1);
    }

    @Test
    public void setPrice() throws Exception {
        int price = 10;
        Phone iphone = new Phone(1111, 45, new Spec(Type.SENSOR, "10", "false", "USA"));
        iphone.setPrice(price);
        assertEquals(price, iphone.getPrice(), 0.1);
    }

    @Test
    public void getSpecs() throws Exception {
        Spec spec = new Spec(Type.SENSOR, "10", "false", "USA");
        Phone newPhone = new Phone(1111, 45, spec);
        assertEquals(newPhone.getSpecs().getCountry(), iphone.getSpecs().getCountry());
        assertEquals(newPhone.getSpecs().getType(), iphone.getSpecs().getType());
        assertEquals(newPhone.getSpecs().getModel(), iphone.getSpecs().getModel());
        assertEquals(newPhone.getSpecs().getUsed(), iphone.getSpecs().getUsed());
    }
}