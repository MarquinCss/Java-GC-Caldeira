package exercicios;
import java.util.Random;
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//novos objetos das bibliotecas que usei, random e scanner
       //usando bib para criar o randow
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.print("Digite um número: ");
        int numeroInserido = scanner.nextInt();

        // Verificação
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == numeroInserido) {
                encontrado = true;
                break;
            }
        }

        // Exibimr o resultado
        if (encontrado) {
            System.out.println("O número " + numeroInserido + " tá na lista.");
        } else {
            System.out.println("O número " + numeroInserido + " não foi encontrado na lista.");
        }

        scanner.close();
    }
}
