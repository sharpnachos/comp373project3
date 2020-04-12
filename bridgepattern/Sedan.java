package bridgepattern;

public class Sedan extends Car{
   private int mpg, topSpeed, cost;

   public Sedan(int mpg, int topSpeed, int cost, ManufactureAPI manufactureAPI) {
      super(manufactureAPI);
      this.mpg = mpg;  
      this.topSpeed = topSpeed;  
      this.cost = cost;
   }

   public void build() {
      manufactureAPI.buildCar(cost,mpg,topSpeed);
   }
}