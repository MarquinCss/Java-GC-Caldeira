package caldeiraAula1Java;
	import java.util.Scanner;
public class exercicio13 {
	
	
	  /*
	Escreva um programa que calcule o fatorial de um número inteiro não negativo fornecido pelo usuário.
	 O fatorial de um número N é o produto de todos os inteiros de 1 até N.
	   */
		public static void main(String[] args) {
			
			 Scanner scanner = new Scanner(System.in);
			System.out.print("Digite um número inteiro não negativo: ");
	        int numeroUsuario = scanner.nextInt();

	            long fatorial = 1; 

	            for (int i = 1; i <= numeroUsuario ; i++) {
	                fatorial *= i;
	            }

	            System.out.println("O fatorial de " + numeroUsuario + " é " + fatorial); 
	            scanner.close();
	        }
//Fiz isso em php uma vez, incrível como muda poucas coisas de lang para lang!
		//pelo visto JAVA não é aquele MONSTRO que falam, é só ter atenção e paciencia hehe.
	     
	    }
	
