package usjt;

public class Retangulo extends Poligono implements Diagonal{

   public Retangulo(double base, double altura) {
      this.altura = altura;
      this.base = base;
   }
   
   @Override
   public double area() {
      return this.getBase() * this.getAltura();
   }
   
   @Override
   public double diagonal() {
      return Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2 ));
   }
   
   @Override
   public double perimetro() {
      return (2 * this.base) + (2 * this.altura);
   }
}
