package com;



import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Inventory {
    private List<Phone> phones;
    public Inventory(){
        phones = new LinkedList();
    }
    public void addPhone(int serialNumber, double price, Spec spec){
        Phone phone = new Phone(serialNumber, price, spec);
        phones.add(phone);
    }
    public Phone getPhone(int serialNumber){
        for (Iterator phone1 = phones.iterator(); phone1.hasNext();) {
            Phone phone = (Phone)phone1.next();
            if (phone.getSerialNumber() == serialNumber) {
                return phone;
            }
        }
        return null;
    }
    public List search(Phone searchPhone){
        List mathcingGuitars = new LinkedList();
        for (Iterator phone1 = phones.iterator(); phone1.hasNext();) {
            Phone phone = (Phone) phone1.next();
            if (phone.getSpecs().equals(searchPhone.getSpecs()))
                continue;
            mathcingGuitars.add(phone);
        }
        return mathcingGuitars;
    }
    public List getPhones(){
        return this.phones;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "phones=" + phones +
                '}';
    }
}
