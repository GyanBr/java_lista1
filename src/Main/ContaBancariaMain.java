package Main;

import java.util.Scanner;
import Model.ContaBancaria;

public class ContaBancariaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(1, "aaa", 5.0);

        System.out.println();
        System.out.println(conta.getNumeroDaConta());
        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());
        conta.depositar(200.0);
        System.out.println(conta.getSaldo());
        conta.sacar(100.0);
        System.out.println(conta.getSaldo());

        // Solicitando valor do depósito
        System.out.print("Digite o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();

        // Fechando o scanner
        scanner.close();
        conta.depositar(valorDeposito);

        System.out.println(conta.getSaldo());
    }
}
