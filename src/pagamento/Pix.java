package pagamento;

public class Pix implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("vendas.Pagamento realizado via PIX");
        System.out.printf("valor: R$%.2f", valor);
    }
}
