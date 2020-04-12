package bridgepattern;

public class RedSedan implements ManufactureAPI{
    @Override
    public void buildCar(int cost, int mpg, int topSpeed) {
        System.out.println("Building Sedan... Color: red Cost: " + cost + " MPG: " + mpg + " Top Speed: " + topSpeed);
    }
}