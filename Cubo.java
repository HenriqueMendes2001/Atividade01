package usjt;

public class Cubo extends Retangulo {
   public double profundidade;
   
   protected Cubo(double base, double altura, double profundidade) {
      super(base, altura);
      this.profundidade = profundidade;
   }
   
   @Override
   public double area() {
      return base * altura * profundidade;
   }
}