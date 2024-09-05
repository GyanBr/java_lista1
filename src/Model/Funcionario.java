//5. Funcionário
//Crie uma classe chamada “Funcionário” com atributos para armazenar o nome, o salário e o cargo do funcionário.
// Implemente métodos para calcular o salário líquido, considerando descontos de impostos e benefícios.

package Model;

public class Funcionario{
    private String nome;
    private double salario;
    private String cargo;
    private double bonus;
    private double impostos;

    public Funcionario(String nome, double salario, String cargo, double bonus, double impostos) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.bonus = bonus;
        this.impostos = impostos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public double salarioLiquido(){
        return (salario + bonus) - (impostos / 100 * (salario + bonus));
    }
}
