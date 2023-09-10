package caldeiraAula1Java;
import java.util.Scanner;
public class exercicio5 {
  /*
Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis,
 depois, determine e exiba a quantidade de segundos 
que se passaram desde as 0h00min0s e a quantidade de segundos que faltam para a meia-noite.
   */
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite a hora (0-23): ");
	        int hora = scanner.nextInt();

	        System.out.println("Digite os minutos (0-59): ");
	        int minuto = scanner.nextInt();

	        System.out.println("Digite os segundos (0-59): ");
	        int segundo = scanner.nextInt();


	        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
	            System.out.println("Horário inválido meu filho.");
	        } else {
	            // seg/meiaNt
	            int segundosDesdeMeiaNoite = (hora * 3600) + (minuto * 60) + segundo;

	            // seg/faltMeiaNt
	            int segundosFaltandoParaMeiaNoite = (24 * 3600) - segundosDesdeMeiaNoite;

	            System.out.println("Segundos desde a meia-noite: " + segundosDesdeMeiaNoite);
	            System.out.println("Segundos faltando para a meia-noite: " + segundosFaltandoParaMeiaNoite);
	        }

	        scanner.close();
	    }
	}