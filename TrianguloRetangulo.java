package usjt;

public class TrianguloRetangulo extends Poligono {
	
   public TrianguloRetangulo (double base, double altura) {
      this.base = base;
      this.altura = altura;
   }
   
   @Override
   public double area() {
      return (this.getAltura() * this.getBase()) / 2;
   }
	
   @Override
   public double perimetro() {
      return this.base * 3;
   }
}
