package caldeiraAula02;
import java.util.Scanner;

public class exercicio3 {

    /**
     * Exercicio 05 (no caso 3)
     * Escreva um programa que separa a 
     * string em duas metades e imprime a primeira parte.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale uma cor: ");
        String input = scanner.nextLine();

        String pelaMetade = input.substring(0, (input.length() / 2));

        
        //Não sabia que podiamos manipular o length tanto assim, fiquei chocado. 
        if (input.length() % 2 == 0) {
            System.out.println("Metade da sua cor: " + pelaMetade);
            //o Camel case do menino hehe
        } else {
            System.out.println("Seu texto não pode ser dividido em partes iguais");
            System.out.println("Metade aproximada do seu texto: " + pelaMetade);
        }

        scanner.close();
    }
}