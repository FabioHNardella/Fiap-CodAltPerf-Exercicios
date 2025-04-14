package assunto03_Filas.exercicio4;

import assunto03_Filas.filas.FilaInt;

import java.util.Scanner;

public class Processador {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int opcao;
        FilaInt fila = new FilaInt();
        fila.init();
        do {
            System.out.println("1- Inserir um processo na fila");
            System.out.println("2- Executar um processo");
            System.out.println("3- Shutdown");
            opcao = le.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Pid: ");
                    int pid = le.nextInt();
                    fila.enqueue(pid);
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há processos na fila");
                    } else {
                        pid = fila.dequeue();
                        System.out.println("O processo " + pid + " está sendo executado");
                        System.out.print("...o processo foi concluído? (1- sim, 2 - não):");
                        int resp = le.nextInt();
                        if (resp == 1) {
                            System.out.println("Pid: " + pid + " concluído!");
                        } else {
                            fila.enqueue(pid);
                            System.out.println("O processo voltou para a fila");
                        }

                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("Fechando o sistema");
                    } else {
                        System.out.println("Ainda há processos em execução");
                        System.out.print("Deseja encerrar todos? (1- sim, 2-não): ");
                        int resp = le.nextInt();
                        if (resp == 1) {
                            while (!fila.isEmpty()) {
                                System.out.println("Encerrado o processo: " + fila.dequeue());
                            }
                        } else {
                            opcao = -1;
                        }

                    }
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 3);
        System.out.println("Shutdown...");
        le.close();

    }

}
