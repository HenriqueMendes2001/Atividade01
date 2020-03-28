package usjt;

public class Quadrado extends Poligono implements Diagonal{

   public Quadrado(double base) {
      this.base = base;	
   }
   
   @Override
   public double area() {
      return this.getBase() * this.getBase();
   }
   
   @Override
   public double diagonal() {
      return  area() * Math.sqrt(2) / 10;
   }
   
   @Override
   public double perimetro() {
      return 4 * this.base;
   }
}
