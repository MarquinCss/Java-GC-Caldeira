package caldeiraAula1Java;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vou te ajudar a converter seu money hoje!");

     
        System.out.print("Diz quantos dolares tu quer converter:");
        double dolar = scanner.nextDouble();

    
        System.out.print("Qual a taxa de câmbio atual: ");
        double taxa = scanner.nextDouble();
 
         //continha de exatas no caso a quantid. de dolares multiplicado pela taxa
        double valorConvertido = dolar* taxa;

        
        System.out.println(dolar + " dólares equivalem a " + valorConvertido + " de acordo com os valores que tu me passou." );
        scanner.close();
    }
}