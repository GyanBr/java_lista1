package Main;

import Model.Produto;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto produto = new Produto("Refrigerante", 10.50, 10);
        System.out.println(produto);
        System.out.println(produto.getNome());
        System.out.println(produto.valorTotal());
        produto.estaDisponivel();
    }
}
