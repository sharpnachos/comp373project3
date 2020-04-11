package bridgepattern;

public class Sedan extends Car {
    
    public Sedan(Color color) {
        super(color);
    }

    @Override
    public String build(){
        return "Sedan manufactured. " + color.fill();
    }
}