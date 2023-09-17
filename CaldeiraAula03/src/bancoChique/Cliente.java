package bancoChique;

public class Cliente {
public static void main(String[] args) {
	

	Conta marco = new Conta();
	marco.saldo = 500;
	
	marco.deposita(500);
	
	System.out.println(marco.getSaldo());
	
	
  }

}
