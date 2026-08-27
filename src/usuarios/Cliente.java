package usuarios;

import produtos.Produto;
import vendas.Carrinho;

public class Cliente extends Pessoa {

    private Carrinho carrinho;
    public Cliente (String nome, String cpf, String email) {
        super(nome, cpf, email);
        this.carrinho = new Carrinho();
    }
    @Override
    public String getTipo() {
        return "Usuarios.Cliente";
    }
    public Carrinho getCarrinho() {
        return carrinho;
    }
    public void adicionarProdutoAoCarrinho(Produto produto) {
        carrinho.adicionarProduto(produto);
    }
    public void listarCarrinho() {
        carrinho.listarProdutos();
    }
}
