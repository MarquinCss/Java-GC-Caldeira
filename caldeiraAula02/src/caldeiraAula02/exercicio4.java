package caldeiraAula02;
import java.util.Scanner;
public class exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo (sem ser números): ");
        String input = scanner.nextLine();

        String reverso1 = reverso111(input);
        System.out.println("[Solução 1] A string ao contrário é: " + reverso1  );

       

        scanner.close();
    }
    public static String reverso111(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.reverse().toString();
    }
  
}

