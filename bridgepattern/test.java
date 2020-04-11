package bridgepattern;

public class test {

    public static void main (String args[]){
        Car accord = new Sedan(new Green());
      
        accord.build();
    }
}