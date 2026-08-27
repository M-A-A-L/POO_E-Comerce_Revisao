package servicos;

import produtos.Produto;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorProdutos {
    private Set<Produto> produtos;
    public GerenciadorProdutos() {
        produtos = new HashSet<>();
    }
    public void adicionarProdutos(Produto produto) {
        produtos.add(produto);
    }
    public void listarProdutos() {
        System.out.println("==== PRODUTOS ====");
        for (Produto produto : produtos) {
            produto.exibirProduto();
            System.out.println();
        }
    }
}
