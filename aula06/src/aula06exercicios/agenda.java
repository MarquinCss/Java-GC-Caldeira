package aula06exercicios;
import java.util.*;

public class Agenda {
    public static void main(String[] args) {
        // TreeMap com os contatos
        TreeMap<String, Contato> agenda = new TreeMap<>();

        // Adicionar contatos à agenda
        agenda.put("Alice", new Contato("984386201", "Luciana Alves", "Acesso c Porto Alegre, Norte"));
        agenda.put("Bob", new Contato("986561340", "Bianca T.", "Rua B Canoas, Sul"));
        agenda.put("Charlie", new Contato("40028922", "Bom dia e companhia", "Rua C, Centro"));
        agenda.put("David", new Contato("456-789-0123", "David", "Rua D Porto Alegre, Leste"));
        agenda.put("Eve", new Contato("567-890-1234", "Evelyn Eggres", "Rua Colomo Sao Paulo, Oeste"));

        // Imprimir lista de contatos
        System.out.println("Lista de Contatos em Ordem Alfabética:");
        for (String nome : agenda.keySet()) {
            Contato contato = agenda.get(nome);
            System.out.println("Nome: " + contato.getNome() +
                               ", Telefone: " + contato.getTelefone() +
                               ", Endereço: " + contato.getEndereco());
        }

       
        String localidade = "Norte";
        System.out.println("\nContatos na Localidade " + localidade + ":");
        for (Contato contato : agenda.values()) {
            if (contato.getLocalidade().equalsIgnoreCase(localidade)) {
                System.out.println("Nome: " + contato.getNome() +
                                   ", Telefone: " + contato.getTelefone() +
                                   ", Endereço: " + contato.getEndereco());
            }
        }
    }
}

class Contato {
    private String telefone;
    private String nome;
    private String endereco;

    public Contato(String telefone, String nome, String endereco) {
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLocalidade() {
       
        if (endereco.contains("Norte")) {
            return "Norte";
        } else if (endereco.contains("Sul")) {
            return "Sul";
        } else if (endereco.contains("Centro")) {
            return "Centro";
        } else if (endereco.contains("Leste")) {
            return "Leste";
        } else if (endereco.contains("Oeste")) {
            return "Oeste";
        } else {
            return "Desconhecida";
        }
    }
}
