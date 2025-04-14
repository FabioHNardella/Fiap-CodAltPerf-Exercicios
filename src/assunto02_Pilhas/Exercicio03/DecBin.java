package assunto02_Pilhas.Exercicio03;

import java.util.Scanner;

import assunto02_Pilhas.Exercicio02.pilhas.PilhaInt;

public class DecBin {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaInt pilha = new PilhaInt();
        int decimal, resto;
        System.out.println("Informe o valor em decimal (positivo): ");
        decimal = sc.nextInt();
        sc.close();

        System.out.print("Valor em binário: ");
        while (decimal > 0) {
            resto = decimal % 2;
            pilha.push(resto);
            decimal = decimal / 2;
        }
        System.out.println("Valor em binario: ");
        pilha.empty();
    }

}
