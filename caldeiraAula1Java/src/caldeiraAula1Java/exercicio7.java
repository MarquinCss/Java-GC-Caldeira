package caldeiraAula1Java;
import java.util.Scanner;
public class exercicio7 {
/*
  Exercicio 07
Criar para uma empresa de consórcio. 
No teste inicial, você deve perguntar para o usuário a
 idade dele e o seu salário. A pessoa só pode comprar um automóvel se 
 for de maior e ganhar mais de R$ 2.000,00.
 */
	
	//main + ctrl + espaco
	
	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	
	  System.out.println("Digite seu nome: ");
      String nome = scanner.nextLine();

      
      System.out.println("Digite seu salario: ");
      double salario = scanner.nextDouble();
      

      System.out.println("Digite sua idade: ");
      int idade = scanner.nextInt();
      
      scanner.close();
      
       if(salario < 2000 && idade < 18) {
    	  
    	  System.out.println( nome + ", você não pode comprar um automóvel, você tem a idade necessária, mas não tem o requisito de um salario acima de 2000 reais.");
      }
      
        else if (salario >= 2000 && idade < 18) {
     	  
     	  System.out.println( nome + ", você não pode comprar um automóvel, você tem que ter +18 anos, então não adianta você ter um salario acima de 2000 reais.");
       }
       
       
        else if (salario < 2000 && idade < 18) {
       	  
       	  System.out.println( nome + ", você tem menos de 18 anos e não ganha acima de 2000 que é um requisito para adquirir um automovel aqui.");
         }
       

        else if (salario < 2000 && idade > 18) {
       	  
       	  System.out.println( nome + ", você tem mais de 18 anos mas não ganha acima de 2000 que é um requisito para adquirir um automovel aqui.");
         }
       
        else if (salario >= 2000 && idade > 18) {
         	  
         	  System.out.println( nome + ", voce tem os requisitos para adquirir seu automovel aqui! Seja bem vindo.");
           }
	}
	
}
