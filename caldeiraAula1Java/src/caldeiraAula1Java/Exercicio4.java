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

	        scanner.close();

	        double contasalariomin = salario / 1320;

	        // Criar um objeto DecimalFormat para formatar o resultado com duas casas decimais
	        // não podemos esquecer de por o import disso la em cima
	        DecimalFormat df = new DecimalFormat("#.##");
	        String contasalariominFormatado = df.format(contasalariomin);

	        System.out.println(" Meu nome é " + usuarioMarco.getNome() + " e recebo "
	                + salario + ", então se formos ver eu recebo " + contasalariominFormatado + " salários mínimos.");
	    }
	}