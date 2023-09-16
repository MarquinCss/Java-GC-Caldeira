package caldeiraAula02;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Determine números primos no intervalo que você quiser: ");
        System.out.println("Digite o primeiro numero: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Intervalo escolhido [ " + firstNumber + " , " + secondNumber + " ]");
        System.out.println("Numeros primos encontrados: ");

        for (int i = firstNumber; i <= secondNumber; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Função para verificar se um número é primo
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
