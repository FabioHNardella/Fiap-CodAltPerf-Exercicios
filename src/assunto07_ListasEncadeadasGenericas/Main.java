package assunto07_ListasEncadeadasGenericas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaIntCrescente lista = new ListaIntCrescente();
        System.out.print("Digite valor positivo para inserção (negativo = sair): ");
        int valor = sc.nextInt();
        while(valor >=0){
            lista.inserir(valor);
            lista.mostrar();
            System.out.print("Digite o próximo valor positivo para inserção (negativo = sair): ");
            valor = sc.nextInt();
        }
        sc.close();
    }

}
