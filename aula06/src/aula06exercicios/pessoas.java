package aula06exercicios;

import java.util.HashMap;
import java.util.Map;

public class Pessoas{
    public static void main(String[] args) {
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Marco", 55);
       pessoas.put("Ka", 24);
       pessoas.put("Anitinha", 79);
       pessoas.put("Jean", 30);
       pessoas.put("Diego", 78);
        pessoas.put("Matheus", 95);

        // método para imprimir os nomes do pessoal que tá na terceira idade;
        
        for (Map.Entry<String, Integer> pessoasDaterceiraIdade : pessoas.entrySet()) {
            String nome = pessoasDaterceiraIdade.getKey();
            int idade = pessoasDaterceiraIdade.getValue();

            if (pessoasDaterceiraIdade.getValue() >= 60) {
                System.out.println("Terceira idade: "+nome +","+idade  );
            }
        }


    }

}