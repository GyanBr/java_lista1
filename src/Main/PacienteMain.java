package Main;

import Model.Paciente;

public class PacienteMain {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Gustavo Garcia", 12);
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("Idade: " + paciente.getIdade());
    }

}
