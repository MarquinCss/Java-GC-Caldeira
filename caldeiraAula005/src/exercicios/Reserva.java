package exercicios;
import java.text.SimpleDateFormat;
import java.util.Date;

class Reserva {
    private String nome;
    private String local;
    private String cpf;
    private Date dataEntrada;
    private Date dataSaida;

    public Reserva(String nome, String local, String cpf, Date dataEntrada, Date dataSaida) {
        this.nome = nome;
        this.local = local;
        this.cpf = cpf;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String entradaFormatada = dateFormat.format(dataEntrada);
        String saidaFormatada = dateFormat.format(dataSaida);
        return "Nome: " + nome + "\nLocal: " + local + "\nCPF: " + cpf + "\nData de Entrada: " + entradaFormatada
                + "\nData de Saída: " + saidaFormatada + "\n";
    }
}
