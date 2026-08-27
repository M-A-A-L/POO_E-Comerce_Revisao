package pagamento;

public class CartaoCredito implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("vendas.Pagamento realizado no cartão");
        System.out.printf("valor: R$%.2f", valor);
    }
}
