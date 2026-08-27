package pagamento;

public class Boleto implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("vendas.Pagamento realizado por boleto");
        System.out.printf("valor: R$%.2f", valor);
    }
}
