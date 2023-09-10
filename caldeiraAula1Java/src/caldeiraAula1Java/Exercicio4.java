package caldeiraAula1Java;

import java.util.Scanner;
import java.text.DecimalFormat; // esses imports, pelo o que foi pesquisado, posso chamar de BIBLIOTECAS
//são tipo elementos que estão FORA do java.lang, o pacote padrão od java que baixamos e tal.

public class Exercicio4 {

	//as informações do objeto eu coloquei no Usuario.java
	
	   public static void main(String[] args) {
	        Usuario usuarioMarco = new Usuario();
	     
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Seu nome:");
	        String nome = scanner.nextLine();
   usuarioMarco.setNome(nome);
   
	        System.out.println("Digite o valor do salário: ");
	        double salario = scanner.nextDouble();
	        usuarioMarco.setSalario(salario);

	        double contasalariomin = salario / 1320;

	        // Criar um objeto DecimalFormat para formatar o resultado com duas casas decimais
	        DecimalFormat df = new DecimalFormat("#.##");
	        String contasalariominFormatado = df.format(contasalariomin);

	        System.out.println("1. Meu nome é " + usuarioMarco.getNome() + " e se uma pessoa"
	                + " recebe " + salario + " ela recebe " + contasalariominFormatado + " salários mínimos.");
	    }
	}