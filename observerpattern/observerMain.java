package observerpattern;

public class observerMain {
    public static void main(String [] args)throws Exception{
        BMW bmw = new BMW();
        Benz benz = new Benz();
        System.out.println("\n");
        CarBrands dealership = new CarBrands("Lamborghini",5);
        System.out.println("\n");
        dealership.addBrand(bmw);
        dealership.addBrand(benz);
        dealership.setName("BMW");
        dealership.setInventory(37);
        dealership.setName("Mercedes Benz");
        dealership.setInventory(14);
        dealership.takeInventory();
        dealership.listVheicles();
    }
}