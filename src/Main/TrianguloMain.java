package Main;

import Model.Triangulo;

public class TrianguloMain {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(1,2,4);

        System.out.println(triangulo);
        System.out.println(triangulo.getLado1());
        triangulo.eTrianguloValido();
        triangulo.calcularArea();

    }
}
