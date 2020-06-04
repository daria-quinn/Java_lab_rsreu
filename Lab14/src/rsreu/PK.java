package rsreu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PK  {
    private List<Observer> observers = new ArrayList<Observer>();
    private List<String> products = new ArrayList<String>();
    public void addProduct(String name) {
        products.add(name);
        notifyObservers();
    }
    public void removeStudent(String name) {
        products.remove(name);
        notifyObservers();
    }
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.event(products);
        }
    }
}
