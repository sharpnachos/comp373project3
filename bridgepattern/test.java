package bridgepattern;

public class test {

    public static void main (String args[]){
        Car redSedan = new Sedan(30, 120, 35000, new RedSedan());
        Car blueSedan = new Sedan(10, 180, 50000, new BlueSedan());

        redSedan.build();
        blueSedan.build();
    }

}