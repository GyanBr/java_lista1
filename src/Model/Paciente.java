//9. Paciente
//Crie uma classe chamada “Paciente” que possua atributos para armazenar o nome, a idade e o histórico de consultas de um paciente.
//Implemente métodos para adicionar uma nova consulta ao histórico e exibir as consultas realizadas.
package Model;

import java.util.List;

public class Paciente {

    //atributos
    private String nome;
    private int idade;
    private List <String> historicoConsultas;

    //construtores


    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.historicoConsultas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<String> getHistoricoConsultas() {
        return historicoConsultas;
    }

    public void setHistoricoConsultas(List<String> historicoConsultas) {
        this.historicoConsultas = historicoConsultas;
    }
    public void InserirConsulta(String consulta) {
        historicoConsultas.add(consulta);
        System.out.println(historicoConsultas);
    }
    public void excluirConsulta(String consulta) {
        historicoConsultas.remove(consulta);
        System.out.println(historicoConsultas);
    }
    public void exibirConsultas() {
        System.out.println(historicoConsultas);
    }
}
