package observerpattern;

import java.util.HashMap;

public class BMW implements Observer {

    private String name = "Representing BMW German car engineering";
    private Integer inventory;

    @Override
    public void update(HashMap<String,Integer> carBrands){
        this.inventory = carBrands.get("BMW").intValue();
        System.out.println( name +" , your facility holds "+inventory+" of our vheicles in stock");
    }

}