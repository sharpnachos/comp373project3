package observerpattern;

import java.util.*;

public class CarBrands implements Subject{

    private LinkedList<Observer> observe = new LinkedList<Observer>();
    private HashMap<String, Integer> carBrands = new HashMap<String, Integer>();

    private LinkedList<Integer> inventory = new LinkedList<Integer>();
    private String name;
    private Integer sample;

    public String getBrandName(){
        return name;
    }

    public Integer getInventory() {
        return sample;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInventory(Integer sample) {
        this.sample = sample;
        inventory.add(sample);
        carBrands.put(name,sample);
    }

    public CarBrands(String name, Integer sample){
        this.name = name;
        this.sample = sample;
        carBrands.put(name,sample);
        System.out.println("The car manufacturer "+name+" has placed "+sample+" vheicles in our stock");
    }

    public void listVheicles(){
        System.out.println(carBrands);
    }

    @Override
    public void addBrand(Observer observer) {
        observe.add(observer);
    }

    @Override
    public void takeInventory() {
        
        for (Observer brands : observe){
            /*for(int i=0;i<=inventory.size();i++){
                this.sample = inventory.get(i);
                brands.update(sample);
            }*/
            brands.update(carBrands);
            System.out.println("\n");
            
        
        }

    }

}