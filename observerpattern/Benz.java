package observerpattern;

import java.util.HashMap;

public class Benz implements Observer {

    private String name = "Mercedes Benz luxury automotive";
    private Integer inventory;

    @Override
    public void update(HashMap<String,Integer> carBrands) {
        this.inventory = carBrands.get("Mercedes Benz").intValue();
        System.out.println( name+" , your facility holds "+inventory+" of our vheicles in stock");

    }

}