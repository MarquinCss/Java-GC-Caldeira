package caldeiraAula1Java;
import java.util.Scanner;
public class exercicio9 {
/*
 Crie um programa em Java 
  que peça ao usuário para inserir seu ano de nascimento 
  e, em seguida, calcule e exiba a idade.
 */
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 System.out.println("Qual seu ano de nascimento?");
	 int anoNascido =  scanner.nextInt() ;
	 scanner.close();

	 int anoAtual = 2023;
	 int contaIdade =  anoAtual - anoNascido;
	 
	 System.out.println("Se você nasceu em " + anoNascido + ", hoje em dia você tem ou vai fazer " + contaIdade);
	
	
          }
    }
