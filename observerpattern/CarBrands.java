package observerpattern;

import java.util.*;

public class CarBrands implements Subject{

    private LinkedList<Observer> observe = new LinkedList<Observer>();

    private Integer inventory;
    private String name;

    public String getBrandName(){
        return name;
    }

    public Integer getInventory(){
        return inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
        takeInventory();
    }

    public CarBrands(String name, Integer inventory){
        this.name = name;
        this.inventory = inventory;
    }

    @Override
    public void addBrand(Observer observer) {
        observe.add(observer);
    }

    @Override
    public void takeInventory() {
        for (Observer brands : observe){
            brands.update(this.inventory);
        }

    }

}