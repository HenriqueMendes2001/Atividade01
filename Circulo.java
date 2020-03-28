package usjt;

public class Circulo extends Figura {
	
	protected double raio;
	
	public Circulo (double raio) {
		this.raio = raio;
	}
   
   @Override
	public double area() {
		return Math.pow(this.raio, 2) * Math.PI;
	}
   
   @Override
   public double perimetro() {
      return 2 * Math.PI * this.raio;
   }
}

// colocar @Override nas classes concretas
