package caldeiraAula1Java;
import java.util.Scanner;
public class exercicio11 {
  /*
   11.Peça ao usuário que digite uma palavra ou frase e conte quantas vogais
    (a, e, i, o, u) estão presentes. Exiba o número de vogais na tela.
   */
	public static void main(String[] args) {
		//encontrei um problema após fazer o laço, ele só esta lendo vogais minusc. (a,e,i,o,u) e não
		//(A,E,I,O,U).... Pode ser resolvido com este pequeno trecho
		//de código  String palavraFrase = scanner.nextLine().toLowerCase();
		//teste: AEIOUaeiou
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma palavra ou uma frase: ");
		String palavraFrase = scanner.nextLine().toLowerCase();
		int vogais = 0;
		   for (int i = 0; i < palavraFrase.length(); i++) {
	            char caractere = palavraFrase.charAt(i);
	            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
	                vogais++;
	            }
	        }
		    System.out.println("O número de vogais na palavra/frase é: " + vogais);
		scanner.close();
	}
}
