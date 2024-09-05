//8. Carro
// Implemente uma classe chamada “Carro” com atributos para
//armazenar a marca, o modelo e a velocidade atual do carro. Adicione métodos para acelerar, frear e exibir a velocidade atual.

package Model;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, double velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public void acelerar(double incremento) {
        this.velocidadeAtual += incremento;
        System.out.println("O carro acelerou, chegando a " + velocidadeAtual);
    }
    public void frear(double incremento) {
        this.velocidadeAtual -= incremento;
        System.out.println("O carro freou, chegando a " + velocidadeAtual);
    }
    public void mostrarVelocidadeAtual() {
        System.out.println("Velocidade Atual: " + velocidadeAtual);
    }
}
