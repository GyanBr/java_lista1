package Main;

import Model.Circulo;

public class CirculoMain {
    public static void main(String[] args) {
//        criação de um objeto com raio de 5.0
       Circulo teste = new Circulo(5.0);
       System.out.println(teste.getRaio());
       System.out.println(teste.getArea());
       System.out.println("perímetro: " + String.format("%.2f", teste.getPerimetro()) + ".");

    }
}
