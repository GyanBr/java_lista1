//2. ContaBancária
////Implemente uma classe chamada “ContaBancária” que possua
// atributos para armazenar o número da conta, nome do titular e saldo.
// Adicione métodos para realizar depósitos e saques
package Model;


public class ContaBancaria {
    private int numeroDaConta;

    private String titular;

    private double saldo;

    public ContaBancaria(int numeroDaConta, String titular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor) {
        saldo -= valor;
    }


}


