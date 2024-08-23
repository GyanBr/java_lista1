package Main;

import Model.ContaBancaria;

public class ContaBancariaMain {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(1, "aaa", 5.0);

        System.out.println();
        System.out.println(conta.getNumeroDaConta());
        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());
        conta.depositar(200.0);
        System.out.println(conta.getSaldo());
        conta.sacar(100.0);
        System.out.println(conta.getSaldo());
    }
}
