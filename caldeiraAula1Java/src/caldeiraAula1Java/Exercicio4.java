package caldeiraAula1Java;

public class Exercicio4 {

	//as informações do objeto eu coloquei no Usuario.java

	    public static void main(String[] args) {
	        Usuario usuarioMarco = new Usuario();
	        usuarioMarco.setNome("Marco");
	        usuarioMarco.setSalario(2640);
	        double contasalariomin = usuarioMarco.getSalario()/1320;
	        
	        System.out.println("1. Meu nome é " + usuarioMarco.getNome() + " e se uma pessoa"
	        		+ " recebe " + usuarioMarco.getSalario() + " ela recebe " + contasalariomin + " salarios min.");  
	    
	}

}
