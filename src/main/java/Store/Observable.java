package Store;

import java.util.*;

public class Observable {
    private List<Observer>  observers= new ArrayList<Observer>();
    private int value;
    public void setValue(int value){
        this.value = value;
        notifyObservers();
    }
    public int getValue(){
        return this.getValue();
    }
    public void addObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

