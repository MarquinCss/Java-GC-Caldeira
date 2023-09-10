package caldeiraAula1Java;
import java.util.Scanner;
public class exercicio3 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o primeiro número: ");
	        double n1 = scanner.nextDouble();
	        
	        System.out.println("Digite mais um número ");
	        double n2 = scanner.nextDouble();
	 

	        System.out.println("Digite o ultimo agora hehe: ");
	        double n3 =  scanner.nextDouble();

	        scanner.close();
	        

	        double maior, menor;

	        // Verifica o maior número
	        if (n1 >= n2 && n1 >= n3) {
	            maior = n1;
	        } else if (n2 >= n1 && n2 >= n3) {
	            maior = n2;
	        } else {
	            maior = n3;
	        }

	        // Verifica o menor número
	        if (n1 <= n2 && n1 <= n3) {
	            menor = n1;
	        } else if (n2 <= n1 && n2 <= n3) {
	            menor = n2;
	        } else {
	            menor = n3;
	        }

	        // não posso esquecer de por os "()" para o 
	        //computador somar primeiro e dividir depois, para fazer a média
	        double media = (n1 + n2 + n3) / 3;

	        System.out.println("Maior número: " + maior);
	        System.out.println("Menor número: " + menor);
	        System.out.println("Média aritmética: " + media);
	    
	}



}
