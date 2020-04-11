package observerpattern;

public class Benz implements Observer{

    @Override
    public void update(Integer inventory) {
        System.out.println("Representing Mercedes Benz luxury automotive, your facility holds "+inventory+" of our vheicles in stock");

    }

}