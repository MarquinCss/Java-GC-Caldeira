package caldeiraAula02;
import java.util.Scanner;
public class exercicio2 {

public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
       boolean keepGoing = true;

	  	System.out.println("Olá, seja bem-vindo a sua calculadora JAVA");
	 while (keepGoing) {
		 


         System.out.println("Digite um primeiro número: ");
         double firstNumber = scanner.nextDouble();
         System.out.println("Digite um segundo número: ");
         double secondNumber = scanner.nextDouble();

         
  //"próxima linha para não bugar
         scanner.nextLine();

         System.out.println("Digite se quiser...");
         System.out.println(" '+' Adicionar  ");
         System.out.println(" '-' para Subtrair ");
         System.out.println(" '*' para Multiplicar ");
         System.out.println(" '/' para Dividir ");
         System.out.println("ou digite N ou n para encerrar. ");
         String option = scanner.nextLine().toLowerCase();
         double result;
         switch (option) {
             case "+" -> {
                 result = firstNumber + secondNumber;
                 System.out.println(firstNumber + " + " + secondNumber + " = " + result);
             }
             case "-" -> {
                 result = firstNumber - secondNumber;
                 System.out.println(firstNumber + " - " + secondNumber + " = " + result);
             }
             case "*" -> {
                 result = firstNumber * secondNumber;
                 System.out.println(firstNumber + " * " + secondNumber + " = " + result);
             }
           
             case "/" -> {
                 if (secondNumber != 0.0) {
                     result = firstNumber / secondNumber;
                     System.out.println(firstNumber + " / " + secondNumber + " = " + result);
                 } else {
                     System.out.println("Erro: Divisão por zero.");
                 }
             }
             case "n" -> {
                 System.out.println("Adeus");
                 keepGoing = false;
             }
             default -> System.out.println("Opção inválida!");
         }
      	System.out.println("Obrigadinho por calcular aqui.");
     }
     scanner.close();
 }
}
