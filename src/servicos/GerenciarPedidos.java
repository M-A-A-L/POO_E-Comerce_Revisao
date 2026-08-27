package servicos;

import vendas.Pedido;

import java.util.ArrayList;
import java.util.List;

public class GerenciarPedidos {
    private List<Pedido> pedidos;

    public GerenciarPedidos() {
        pedidos = new ArrayList<>();
    }
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    public Pedido buscarPedido(int indice) {
        return pedidos.get(indice);
    }
    public int quantidadePedidos() {
        return pedidos.size();
    }
    public void listarPedidos() {
        System.out.println("==== PEDIDOS ====");
        for (Pedido pedido : pedidos) {
            pedido.listarPedido();
            System.out.println();
        }
    }
}
