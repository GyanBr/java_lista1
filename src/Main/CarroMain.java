package Main;

import Model.Carro;

public class CarroMain {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Fiesta", 80);
        carro.acelerar(30);
        carro.frear(50);
        carro.mostrarVelocidadeAtual();
    }


}
