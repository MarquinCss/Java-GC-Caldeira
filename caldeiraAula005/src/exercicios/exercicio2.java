package exercicios;
import java.util.Random;
import java.util.Scanner;

/*
 * Exercício 2: Uso de Array
Descrição: Crie um programa Java que gere automaticamente um
 array de 10 números inteiros aleatórios entre 1 e 100. Em seguida, 
 peça ao usuário para inserir um número e verifique se esse número está 
 presente no array. Exiba uma mensagem indicando se o número foi encontrado ou não.
 */
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
            System.out.println("O número " + numeroInserido + " está na lista.");
        } else {
            System.out.println("O número " + numeroInserido + " não foi encontrado na lista.");
        }
//NÃO ESQUECER DE FECHAR SCANNER PELO AMOR kkkkkkkk
        scanner.close();
    }
}
