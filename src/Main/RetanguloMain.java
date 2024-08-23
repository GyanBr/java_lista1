package Main;

import Model.Retangulo;

public class RetanguloMain {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(3.5, 2.7);
        System.out.println(retangulo);
        System.out.println("Altura: " + String.format("%.2f", retangulo.getAltura())+ ".");
        System.out.println("Largura: "+ String.format("%.2f", retangulo.getLargura())+ ".");
        System.out.println("Area: " + String.format("%.2f", retangulo.calcularArea()) + ".");
    }
}
