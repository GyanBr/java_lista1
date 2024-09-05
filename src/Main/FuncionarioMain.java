
package Main;

import Model.Funcionario;

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João Sem Braço", 4000, "Gestor", 400, 50);
        System.out.println("Salário líquido: " + funcionario.salarioLiquido());
        System.out.println("Salário Bruto: " + funcionario.getSalario());
        System.out.println("Nome do funcionario: " + funcionario.getNome());
        System.out.println("Impostos: " + funcionario.getImpostos()+ "% do total salarial");
    }
}
