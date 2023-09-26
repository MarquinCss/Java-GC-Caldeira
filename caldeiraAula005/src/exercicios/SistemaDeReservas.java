package exercicios;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class SistemaDeReservas {
    public static void main(String[] args) throws ParseException {
        LinkedList<Reserva> listaDeReservas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Sistema de Reservas de Passagens de Avião =====");
            System.out.println("1. Reservar Passagem");
            System.out.println("2. Cancelar Reserva");
            System.out.println("3. Exibir Lista de Reservas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            switch (escolha) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Local: ");
                    String local = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Data de Entrada (dd/MM/yyyy): ");
                    String dataEntradaStr = scanner.nextLine();
                    System.out.print("Data de Saída (dd/MM/yyyy): ");
                    String dataSaidaStr = scanner.nextLine();

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date dataEntrada = dateFormat.parse(dataEntradaStr);
                    Date dataSaida = dateFormat.parse(dataSaidaStr);

                    Reserva reserva = new Reserva(nome, local, cpf, dataEntrada, dataSaida);
                    listaDeReservas.add(reserva);
                    System.out.println("Passagem reservada com sucesso!");
                    break;
                case 2:
                    if (listaDeReservas.isEmpty()) {
                        System.out.println("A lista de reservas está vazia.");
                    } else {
                        System.out.println("Reservas encontradas:");
                        for (int i = 0; i < listaDeReservas.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeReservas.get(i).getNome());
                        }
                        System.out.print("Digite o número da reserva a ser cancelada: ");
                        int numeroReserva = scanner.nextInt();
                        scanner.nextLine(); 

                        if (numeroReserva >= 1 && numeroReserva <= listaDeReservas.size()) {
                            listaDeReservas.remove(numeroReserva - 1);
                            System.out.println("Reserva cancelada com sucesso!");
                        } else {
                            System.out.println("Número de reserva inválido.");
                        }
                    }
                    break;
                case 3:
                    if (listaDeReservas.isEmpty()) {
                        System.out.println("A lista de reservas está vazia.");
                    } else {
                        System.out.println("Reservas disponíveis:");
                        for (Reserva r : listaDeReservas) {
                            System.out.println(r);
                        }
                    }
                    break;
                case 4:
                    System.out.println("O sistema foi encerrado.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Escolha uma das opções disponíveis.");
            }
        }
    }
}
