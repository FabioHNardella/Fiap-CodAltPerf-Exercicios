package assunto03_Filas.exercicio5;


import assunto03_Filas.filas.FilaString;

import java.util.Scanner;

public class Consultorio {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int opcao;
        FilaString fila = new FilaString();
        fila.init();
        do {
            System.out.println("1- Inserir paciente na fila");
            System.out.println("2- Retirar paciente da fila");
            System.out.println("3- Encerrar atendimento");
            opcao = le.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Nome do paciente que chegou: ");
                    le.nextLine();
                    String nome = le.nextLine();
                    fila.enqueue(nome);
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há pacientes na fila");
                    } else {
                        System.out.println("Paciente que foi atendido agora: " + fila.dequeue());
                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("Encerrando o atendimento");
                    } else {
                        System.out.println("Ainda há pacientes aguardando na fila");
                        opcao = -1;
                    }
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 3);
        le.close();

    }

}
