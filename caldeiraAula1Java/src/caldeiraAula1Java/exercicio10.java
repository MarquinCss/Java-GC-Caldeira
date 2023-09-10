package caldeiraAula1Java;
import java.util.Scanner;
public class exercicio10 {
/*
 Crie um programa em Java que peça ao usuário para inserir uma temperatura 
 em graus Celsius e, em seguida,
  converta essa temperatura em graus Fahrenheit usando a fórmula:
  Fahrenheit = (Celsius * 9/5) + 32. Exiba o resultado na tela.
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fale um valor em Celsius para ser convertido para Fahrenheit: ");
        int celsius = scanner.nextInt();
           //calculo da formula
        double Fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Celsius: " + celsius + " em Fahrenheit: " + Fahrenheit);
        scanner.close();
		//ADOREI, DÁ PARA FAZER ATÉ PARA KELVIN EIN
	}
	
}
