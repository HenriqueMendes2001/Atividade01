package usjt;

public class Piramide extends TrianguloRetangulo {
   public double profundidade;
   
   protected Piramide(double base, double altura, double profundidade) {
      super(base, altura);
      this.profundidade = profundidade;
   }
   
   @Override
   public double area() {
      return (1 / 3) * base * altura * profundidade;
   }
}