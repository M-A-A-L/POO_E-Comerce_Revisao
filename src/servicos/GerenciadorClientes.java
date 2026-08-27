package servicos;

import usuarios.Cliente;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorClientes {
    private Map<String, Cliente> clientes;
     public GerenciadorClientes() {
         clientes = new HashMap<>();
     }
     public void adicionarCliente(Cliente cliente) {
         clientes.put(cliente.getCpf(), cliente);
     }
     public Cliente buscarClientePorCpf(String cpf) {
         return clientes.get(cpf);
     }
     public void ListarClientes() {
         System.out.println("==== CLIENTES ====");
         for (Cliente cliente: clientes.values()) {
             cliente.exibirInformacoes();
             System.out.println();
         }
     }
}
