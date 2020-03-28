package usjt;

public class Losango extends Poligono {

   public Losango (double base, double altura) {
      this.base = base;
      this.altura = altura;
   }
   
   @Override
   public double area() {
      return this.getBase() * this.getAltura();
   }
   
   @Override
   public double perimetro() {
      return 4 * this.base;
   }
}
