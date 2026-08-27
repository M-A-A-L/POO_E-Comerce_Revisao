package vendas;
import produtos.Produto;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public Produto getProduto() {
        return produto;
    }
    public double calcularSubTotal() {
        return produto.getPreco()*quantidade;
    }
    public void exibirItem() {
        System.out.println(produto.getNome());
        System.out.println("Quantidade: "+quantidade);
        System.out.printf("Subtotal: R$%.2f", calcularSubTotal());
    }
}
