package usuarios;

public class Funcionario extends Pessoa{
    private double salarioBase;
    public Funcionario(String nome, String cpf, String email, double salarioBase) {
        super (nome, cpf, email);
        this.salarioBase =salarioBase;
    }
    @Override
    public String getTipo() {
        return "Funcionário";
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public double calcularSalario() {
        return salarioBase;
    }
    public void trabalhar() {
        System.out.println(getNome()+" está trabalhando.");
    }
}
