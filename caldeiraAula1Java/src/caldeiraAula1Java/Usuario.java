package caldeiraAula1Java;

public class Usuario {
    private String nome;
    private double salario;
    private String profissao;

    // Construtor padrão
    public Usuario() {
        this.nome = "";
        this.salario = 0.0;
        this.profissao = "";
    }

    // Construtor personalizado
    public Usuario(String nome, double salario, String profissao) {
        this.nome = nome;
        this.salario = salario;
        this.profissao = profissao;
    }

    // Métodos de acesso para os campos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
