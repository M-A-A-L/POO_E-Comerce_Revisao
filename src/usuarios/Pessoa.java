package usuarios;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome!=null && !nome.isBlank()) {
            this.nome = nome;
        }
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        if (cpf!=null && cpf.length()==11) {
            this.cpf = cpf;
        }
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }
    }
    public abstract String getTipo();
    public void exibirInformacoes() {
        System.out.println("==== "+(getTipo().toUpperCase())+" ====");
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Email: "+email);
    }
}
