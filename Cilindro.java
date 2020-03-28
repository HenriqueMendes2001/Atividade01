package usjt;

public class Cilindro extends Circulo {
   protected double altura;
   
   protected Cilindro(double raio, double altura) {
      super(raio);
      this.altura = altura;
   }
   
   @Override
   public double area() {
      return Math.PI * Math.pow(this.raio, 3) * this.altura;
   }
}