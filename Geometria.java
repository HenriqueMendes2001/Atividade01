package usjt;

import java.util.ArrayList;
import java.util.List;

public class Geometria {

   public static void main(String[] args) {
      List <Figura> figuras = new ArrayList <>();
      List <Diagonal> diagonal = new ArrayList<>();
   	
      Losango losango = new Losango (5, 5);
      Quadrado quadrado = new Quadrado (10);
      Circulo circulo = new Circulo (10);
      Retangulo retangulo = new Retangulo(15,10);
      TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo (10, 15);
   
      figuras.add(retangulo);
      figuras.add(losango);
      figuras.add(circulo);
      figuras.add(quadrado);
      figuras.add(trianguloRetangulo);
      diagonal.add(quadrado);
      diagonal.add(retangulo);
   	
      for(Figura f: figuras) {
         System.out.println("Area: " + f.area() + "\nPerimetro: " + f.perimetro());
      }
      for(Diagonal d : diagonal) {
    	  System.out.println("Diagonal: " + d.diagonal());
    	  
      }
   }
}