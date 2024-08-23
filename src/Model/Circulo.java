//1. Círculo
//Crie uma classe chamada “Círculo” que possua um atributo para armazenar o raio
//e métodos para calcular a área e o perímetro do círculo.

//Multiplicar el área por π.
//Tomar la raíz cuadrada del resultado del paso 1.
//Multiplicar por 2.

package Model;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getArea() {
        return Math.PI * (raio * raio);

    }
    public double getPerimetro() {
        return Math.PI * raio * 2;
    }
}
