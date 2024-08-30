//4. Aluno
//Implemente uma classe chamada “Aluno” que possua atributos para
// armazenar o nome, a matrícula e as notas de um aluno.
// Adicione métodos para calcular a média das notas e verificar a situação do aluno (aprovado ou reprovado).

package Model;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double media (){
        return (nota1 + nota2 + nota3) /3;
    }
    public String situacaoAluno(){
        if (media() > 6) {
            return "Aprovado, com a media " + media();
        }else {
            return "Reprovado, com a media " + media();
        }
    }
}
