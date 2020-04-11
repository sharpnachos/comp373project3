package observerpattern;

public class BMW implements Observer{
    @Override
    public void update(Integer inventory){
        System.out.println("Representing BMW German car engineering, your facility holds "+inventory+" of our vheicles in stock");
    }

}