package bridgepattern;

public class BlueSedan implements ManufactureAPI{
    @Override
    public void buildCar(int cost, int mpg, int topSpeed) {
        System.out.println("Building Sedan... Color: blue Cost: " + cost + " MPG: " + mpg + " Top Speed: " + topSpeed + "]");
    }
}