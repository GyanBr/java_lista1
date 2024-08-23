
//    3. Retângulo
//    Crie uma classe chamada “Retângulo” que possua atributos para armazenar
//    a largura e a altura.Implemente métodos para calcular a
//    área e o perímetro do retângulo.
package Model;
public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;

    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularArea() {
        return altura * largura;
    }
}
