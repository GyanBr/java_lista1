//6. Produto
//Implemente uma classe chamada “Produto” que possua atributos para
// armazenar o nome, o preço e a quantidade em estoque.
//Adicione métodos para calcular o valor total em estoque e verificar se o produto está disponível.

package Model;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double valorTotal(){
        return (preco * quantidade);
    }
    public void estaDisponivel(){
        if (quantidade > 0){
            System.out.println("Produto disponível, possuindo a quantidade: " + quantidade);
        }
        else{
            System.out.println("Produto indisponível");
        }
    }
    //Adicione métodos para calcular o valor total em estoque e verificar se o produto está disponível.
}













