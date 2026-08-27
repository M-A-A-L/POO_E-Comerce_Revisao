package pagamento;

public class Paypal implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("vendas.Pagamento realizado pelo PayPal");
        System.out.printf("valor: R$%.2f", valor);
    }
}
