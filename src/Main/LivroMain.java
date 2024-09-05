package Main;

import Model.Livro;

public class LivroMain {
    public static void main(String[] args) {
        Livro livro = new Livro("Senhor dos Aneis", "Robson", 200);
        livro.estaDisponivel();
        livro.realizarDevolucao();
    }
}
