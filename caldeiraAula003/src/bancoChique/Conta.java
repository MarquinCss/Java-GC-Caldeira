package bancoChique;
import java.util.Calendar;
//fonte:https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html (calendario bibli)
//Nosso modelinho de conta ficará aqui

public class Conta {
	//referencia
   private  String nome;
    private String cpf;
  private  int numero;
  private   int agencia;
  private    String banco;
  private  String endereco;
  private   double saldo;
  private   Calendar horarioAtual;
    
    

    public Conta() {
        this.nome = "";
        this.cpf = "";
        this.numero = 0;
        this.banco = "";
        this.endereco = "";
        this.saldo = 0.0;
        this.horarioAtual = Calendar.getInstance();
    } //Biblioteca de fora ein


    public Conta(String nome, String cpf, int numero, String banco, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.numero = numero;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = 0.0;
        this.horarioAtual = Calendar.getInstance();
    }
	//Nossos metódos: (NÃO EXISTE METODO DENTRO DE ATRIBUTO, LEMBRAR) 
//Metodos não são iguais a funções (Paulo silveira - alura)
//Metodo é: maneira de fazer alguma coisa

//depositar
public void deposita(double valor) {
    this.saldo = this.saldo + valor;
}

//deposito

public boolean saca(double valor) {
    if(this.saldo >= valor) {
        this.saldo -= valor;
        return true;
    } else {
        return false;
    }
}

//transfere
public boolean transfere(double valor, Conta destino) {
    if(this.saldo >= valor) {
        this.saldo -= valor;
        destino.deposita(valor);
        return true;
    }
    return false;
}

//horario do dia 
public void verificarHorario() {
    int hora = horarioAtual.get(Calendar.HOUR_OF_DAY);
    int minuto = horarioAtual.get(Calendar.MINUTE);
    System.out.println("Horário atual: " + String.format("%02d", hora) + ":" + String.format("%02d", minuto));
}


//pegar saldo
public double getSaldo(){
    return this.saldo;
}

public int getNumero(){
    return this.numero;
}

public void setNumero(int numero){
    if(numero <= 0) {
        System.out.println("Nao pode valor menor igual a 0");
        return;
    }
    this.numero = numero;
}

//verf inf
public void verificarInformacoes() {
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Identificador da Conta: " + numero);
    System.out.println("Banco: " + banco);
    System.out.println("Endereço: " + endereco);
    getSaldo();
    verificarHorario();
}

public int getAgencia(){
    return this.agencia;
}

public void setAgencia(int agencia){
   if(agencia <= 0) {
       System.out.println("Nao pode valor menor igual a 0");
       return;
   }
   this.agencia = agencia;
}

//e o pix? hahaha tá ai

public void pix(double valor) {
    if (horarioAtual.get(Calendar.HOUR_OF_DAY) >= 8 && horarioAtual.get(Calendar.HOUR_OF_DAY) < 19) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Transferência PIX de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência PIX.");
        }
    } else {
        System.out.println("Transferência PIX só é permitida entre 8h e 19h.");
    }
    
}

    //Implemente uma validação no método cpf para garantir que o CPF seja um número válido.
    public boolean verificaCpf(String cpf) {
      
        if (cpf.length() < 11) {
            return false;
        }

        else if (!cpf.matches("\\d+")) {  //nesse eu tava tentando algo tipo === [a-z] ou algo assim.
            return false;
        }

        return true;
    }
public static void main(String[] args) {
    Conta conta1 = new Conta("Marco Marchi", "60003344489", 12345, "Yours Bank", "Rua 9 de setembro, 288");
    Conta conta2 = new Conta("Maria", "10002340998", 54321, "Agi Bank", "Rua Bosque verde, 2256");
    Conta conta3 = new Conta("K Santana", "70033444894", 12345, "Yours Bank", "Rua deodoro, 3828");
    Conta conta4 = new Conta("Lucas Vizeu", "0002340998", 54321, "Caixa", "Rua oitava, 26");

    conta1.deposita(1000.0);
    System.out.println("Saldo da conta 1: R$" + conta1.getSaldo());
    conta1.verificarHorario();
    conta1.pix(500.0);
    conta1.transfere(300.0, conta2);

    
    conta1.verificarInformacoes();
    System.out.println();
    conta2.verificarInformacoes();
    
    conta3.pix(700.0);
    
    // Teste val. cpf
    System.out.println("CPF de conta1 é válido? " + conta1.verificaCpf("60003344489")); 
  
}
}





