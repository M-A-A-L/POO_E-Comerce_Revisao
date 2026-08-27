package usuarios;

public class Administrador extends Funcionario {
    public Administrador(String nome, String cpf, String email, double salario) {
        super (nome, cpf, email, salario);
    }
    @Override
    public double calcularSalario(){
        return getSalarioBase()*1.20;
    }
    @Override
    public String getTipo() {
        return "Usuarios.Administrador";
    }
    public void aprovarDesconto() {
        System.out.println("desconto aprovado.");
    }
}
