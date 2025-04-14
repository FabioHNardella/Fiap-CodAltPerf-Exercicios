package assunto03_Filas.exercicio3;

import assunto03_Filas.filas.FilaInt;

import java.util.Scanner;

public class AtendimentoAlunos {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int opcao;
        FilaInt fila = new FilaInt();
        fila.init();
        do {
            System.out.println("1- Insere aluno na fila");
            System.out.println("2- Retira aluno da fila");
            System.out.println("3- Encerra atendimento");
            opcao = le.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("RM do aluno que chegou: ");
                    int rm = le.nextInt();
                    fila.enqueue(rm);
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há alunos na fila");
                    } else {
                        System.out.println("Aluno que foi atendido agora: " + fila.dequeue());
                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("Encerrado o atendimento");
                    } else {
                        System.out.println("Ainda há alunos aguardando na fila");
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
