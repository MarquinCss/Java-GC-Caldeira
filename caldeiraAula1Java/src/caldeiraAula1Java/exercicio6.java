package caldeiraAula1Java;
import java.util.Scanner;
public class exercicio6 {
	/*Exercicio 06
	Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
	Se for menor de 16 anos, avisar que não pode votar;
	Se tiver 16 ou 17, avisar que o voto é facultativo;
	Se tiver mais de 65, avisar que também é facultativo o voto;
	De 18 até 65, é obrigatório votar.*/
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome (sem acentos): ");
        String nome = scanner.nextLine();

        
        System.out.println("Digite sua idade (numeros): ");
        int idade = scanner.nextInt();
        scanner.close();

        
        
        //elses, ifs etc...
       
         if(idade < 16) {
      	  System.out.println(nome + " você tem " + idade + " anos, você não pode votar ainda meu jovem.");
            
      }
      
        else if(idade >= 18 && idade < 65) {
        System.out.println(nome + " você tem " + idade + " anos, então até completar 65 anos você é obrigado a votar");
        
        }
        
        else if(idade <= 17) {
         	  System.out.println(nome + " você tem " + idade + " anos seu voto é facultativo até o fim dos seus 17 anos");
               
         }
        
        else if(idade >= 65 && idade <= 122) {
       	  System.out.println(nome + " você tem " + idade + " anos seu voto é facultativo, senhor.");
             
       }
      
         
        else if(idade >= 200) {
         	  System.out.println(nome + " você tem " + idade + " sera voce um deus?");
               
         }
        }
        
        
    }



