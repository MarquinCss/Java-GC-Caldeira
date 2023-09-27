package aula06exercicios;
import java.util.Stack;
import java.util.Scanner;

public class oslivros {
    public static void main(String[] args) {
        Stack<Livro> pilhaDeLivros = new Stack<>();

       
        Livro livro1 = new Livro("Akira", "Ficção");
        Livro livro2 = new Livro("Akira 2", "Ficção");
        Livro livro3 = new Livro("História do Brasil", "História");
        Livro livro4 = new Livro("Romeu e Julieta", "Romance");
        Livro livro5 = new Livro("Anne Frank", "História");

        // Adicione os objetos à pilha
        pilhaDeLivros.push(livro1);
        pilhaDeLivros.push(livro2);
        pilhaDeLivros.push(livro3);
        pilhaDeLivros.push(livro4);
        pilhaDeLivros.push(livro5);
        Scanner scanner = new Scanner(System.in);

        while (!pilhaDeLivros.isEmpty()) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Listar livros");
            System.out.println("2. Listar livros por categoria");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    listarLivros(pilhaDeLivros);
                    break;
                case 2:
                    System.out.println("Digite a categoria desejada: (ficção, história ou romance)");
                    String categoria = scanner.next();
                    listarLivrosPorCategoria(pilhaDeLivros, categoria);
                    break;
                case 3:
                    pilhaDeLivros.pop();
                    System.out.println("Livro removido com sucesso meu amigo!");
                    break;
                case 4:
                    System.out.println("Tchauzinho amigo(a), encerrando...");
                    return;
                default:
                    System.out.println("Opção inválida, tenta denovo");
                    break; 
                 
            }
        }   scanner.close();

        System.out.println("Pilha de livros vazia. Tchauuu!");
    }

    private static void listarLivros(Stack<Livro> pilhaDeLivros) {
        System.out.println("Livros disponíveis:");
        for (Livro livro : pilhaDeLivros) {
            System.out.println(livro);
        }
    }

    private static void listarLivrosPorCategoria(Stack<Livro> pilhaDeLivros, String categoriaDesejada) {
        System.out.println("Livros da categoria '" + categoriaDesejada + "':");
        for (Livro livro : pilhaDeLivros) {
            if (livro.getCategoria().equalsIgnoreCase(categoriaDesejada)) {
                System.out.println(livro);
            }
         
        }
    }
}

class Livro {
    private String titulo;
    private String categoria;

    public Livro(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Livro: " +
                "titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}