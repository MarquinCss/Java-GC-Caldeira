package bancoChique;

//Nosso modelinho de conta ficará aqui
public class Conta {
//Referencia
String nome;
int cpf;
int numero;
int agencia;
String banco;
String endereco;
double saldo;
// Não sei ... horaAtual;
//sorry

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

public boolean transfere(double valor, Conta destino) {
    if(this.saldo >= valor) {
        this.saldo -= valor;
        destino.deposita(valor);
        return true;
    }
    return false;
}

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


}





