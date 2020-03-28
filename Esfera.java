package usjt;

public class Esfera extends Circulo {
   
   protected Esfera(double raio) {
      super(raio);
   }
   
   @Override
   public double area() {
      return (4 / 3) * Math.PI * Math.pow(this.raio, 3);
   }
}