package caldeiraAula1Java;

public class Usuario {
    private String nome;
    private double salario;

    // Construtor padrão
    public Usuario() {
        this.nome = "";
        this.salario = 0.0;
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

}