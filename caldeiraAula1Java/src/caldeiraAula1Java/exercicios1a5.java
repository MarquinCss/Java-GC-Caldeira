package caldeiraAula1Java;

public class exercicios1a5 {

		public static void main(String[]args){
			// 1. Imprimir o nome
			System.out.println("1. Meu nome é Marco Marchi");  

			//2. imprimir 2 números na tela (com uma conta?)
			int numero1 = 10;
			int numero2 = 6;
			int minhaidade = numero1 + numero2;
			System.out.println("Eu tenho " + minhaidade + " anos." );

			// 3.Crie um programa que leia 3 números, imprima o maior, o menor e a média

			int numeroMenor = 5;
			int numeroMedio = 10;
			int numeroMaior = 15;
			//tenho que me lembrar de colocar os parenteses "()"
			//pois ele vai ajudar o pc a saber que ele deve fazer a soma primeiro
			//NESSE caso.
			int mediaDosNumeros = (numeroMaior+numeroMenor+numeroMedio)/3;

			System.out.println("Meu número maior é " + numeroMaior + " meu menor é " + numeroMenor + 
					" e tem mais um número que seria " + numeroMedio + " a média desses 3 é igual a " + mediaDosNumeros);


			
		
		}
	}




