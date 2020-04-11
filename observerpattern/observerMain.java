package observerpattern;

public class observerMain {
    public static void main(String [] args){
        BMW bmw = new BMW();
        Benz benz = new Benz();

        CarBrands dealership = new CarBrands("Lamborghini",5);

        dealership.addBrand(bmw);
        dealership.addBrand(benz);
        dealership.setName("BMW");
        dealership.setInventory(37);
        dealership.getInventory();

    }
}