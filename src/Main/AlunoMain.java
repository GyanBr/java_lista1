package Main;

import Model.Aluno;

public class AlunoMain {
    //a
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Teste", "1234567", 1, 2, 3);
        System.out.println(aluno.toString());
        System.out.println(aluno.media());
        System.out.println(aluno.situacaoAluno());
    }
}
