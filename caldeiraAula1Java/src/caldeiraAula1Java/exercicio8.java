package caldeiraAula1Java;
import java.util.Scanner;
public class exercicio8 {
	/*
	 Criar um algoritmo para definir as filas prioritárias.
	  Seu programa deve exibir um menu de opções, 
	  perguntando se a pessoa é Gestante, Idosa, PCD ou Nenhuma das alternativas. 
	 Se ela for PCD, Idosa ou Gestante, tem direito a fila prioritária. Se não, não tem direito."
	 */

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
//Meus estudos de php me salvaram aqui AHSUSHSUHS oh gloria
	        System.out.println("Digite alguma destas opcoes (digite apenas numeros)");
	            System.out.println("1. Sou gestante");
	         System.out.println("2. Sou pessoa idosa");
	          System.out.println("3. Sou PCD (Pessoa com Deficiência)");
	         System.out.println("4. Não sou nenhuma das alternativas acima");
  
	           int opcao = scanner.nextInt();
	           
	           //um toturial do yt me salvou nesse esquema de scan/scanner
	        scanner.close();

	        switch (opcao) {
	            case 1:
	                  System.out.println("Senhora, você tem direito à fila prioritária como gestante.");
	                 break;
	            case 2:
	                System.out.println("Senhora(or), você tem direito à fila prioritária como pessoa idosa.");
	                break;
	            case 3:
	                 System.out.println("Olá, Você tem direito a fila prioritaria como pessoa PCD.");
	                     break;
	                case 4:
	                  System.out.println("Desculpe, mas você não tem direito à fila prioritária.");
	                  break;
	                  //nota para lembrar: default é tipo "nenhum dos casos do switch case"
	            default:
	                  System.out.println("Voce não digitou nenhuma opção válida em nossos sisteminhaaa, se precisar de ajuda entre em contato com o numero (YY) XXXX-XXXXX");
	                break;
	                
	                // Não consegui pensar em outra forma de fazer, tipo com if e else, estou errado?
	        }
	    }
	}


