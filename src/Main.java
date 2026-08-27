import pagamento.CartaoCredito;
import pagamento.Pagamento;
import produtos.Produto;
import servicos.GerenciadorClientes;
import servicos.GerenciadorGenerico;
import servicos.GerenciadorProdutos;
import usuarios.*;
import vendas.Carrinho;
import vendas.Pedido;

public class Main {
    public static void main(String[] args) {
        Pessoa admin = new Administrador("Luffy", "123.456.789-11", "admin@email.com", 7500);
        Pessoa vendedor = new Vendedor("Mercador", "987.654.321-00", "mercador01@email.com", 2000, 0);
        admin.exibirInformacoes();
        vendedor.exibirInformacoes();
        Cliente cliente1 = new Cliente("Kratos", "111.222.333-44", "bomdeguerra@email.com");
        Cliente cliente2 = new Cliente("Subzero", "555.666.777-21", "subzero@email.com");
        Cliente cliente3 = new Cliente("Ash", "543.896.254-12", "ashketchum@email.com");
        GerenciadorClientes repoClientes = new GerenciadorClientes();
        repoClientes.adicionarCliente(cliente1);
        repoClientes.adicionarCliente(cliente2);
        repoClientes.adicionarCliente(cliente3);
        repoClientes.ListarClientes();
        repoClientes.buscarClientePorCpf("111.222.333-44");
        Produto notebook = new Produto("Notebook", 3200, 25);
        Produto mouse = new Produto("Mouse gamer", 250, 50);
        Produto teclado = new Produto("Teclado", 400, 35);
        GerenciadorProdutos repoProdutos = new GerenciadorProdutos();
        repoProdutos.adicionarProdutos(notebook);
        repoProdutos.adicionarProdutos(mouse);
        repoProdutos.adicionarProdutos(teclado);
        repoProdutos.listarProdutos();
        Pedido pedido = new Pedido();
        pedido.adicionarItem(notebook, 1);
        pedido.adicionarItem(mouse, 1);
        pedido.adicionarItem(teclado, 1);
        pedido.listarPedido();
        Pagamento cartao = new CartaoCredito();
        pedido.finalizarPedido(cartao);
    }
}
