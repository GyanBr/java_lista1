//10. Livro
//Implemente uma classe chamada “Livro” com atributos para
//armazenar o título, o autor e o número de páginas do livro.
// Adicione métodos para emprestar o livro, devolvê-lo e verificar se está disponível.


package Model;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    boolean livroDisponivel = true;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public void estaDisponivel() {
        if (livroDisponivel) {
            System.out.println("O livro"+ titulo + " esta disponivel");
        }
        else {
            System.out.println("O livro"+ titulo + " esta em disponivel");
        }
    }
    public void realizarEmprestimo() {
        if (livroDisponivel) {
            System.out.println("Livro Disponivel, aqui está o seu livro " + titulo);
            livroDisponivel = false;
        } else {
            System.out.println("Livro Indisponível, alguém pegou emprestado antes!");
        }
    }
    public void realizarDevolucao() {
            if (!livroDisponivel){
                System.out.println("Agradecemos a devolução! O livro"+ titulo + " está novamente disponivel.");
                livroDisponivel = true;
            }
            else {
                System.out.println("Woops! O livro"+ titulo + " está disponível.");
            }
        }
}
