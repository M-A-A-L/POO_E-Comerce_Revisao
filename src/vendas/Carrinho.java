package vendas;

import produtos.Produto;

import java.util.ArrayList;
import java.util.List;
public class Carrinho {
    private List<Produto> produtos;
    public Carrinho() {
        produtos = new ArrayList<>();
    }
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }
    public int quantidadeProdutos() {
        return produtos.size();
    }
    public void listarProdutos() {
        System.out.println("==== CARRINHO ====");
        for (Produto produto : produtos) {
            produto.exibirProduto();
            System.out.println();
        }
    }
}
