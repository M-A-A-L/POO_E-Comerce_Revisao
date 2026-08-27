package produtos;

import java.util.Objects;

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

    public void exibirProduto() {
        System.out.println("==== PRODUTO ====");
        System.out.println("Nome: "+nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Quantidade: "+quantidade);
    }
    @Override
    public String toString() {
        return "produtos.Produto{"+
                "nome='"+ nome + '\''+
                ", preço="+ preco +
                //", estoque" + estoque +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Produto)) {
            return false;
        }
        Produto outro = (Produto) obj;
        return Objects.equals(this.nome, outro.nome);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

