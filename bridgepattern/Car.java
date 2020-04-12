package bridgepattern;

public abstract class Car {
    protected ManufactureAPI manufactureAPI;

    protected Car(ManufactureAPI manufactureAPI){
        this.manufactureAPI = manufactureAPI;
    }
    public abstract void build();	
}