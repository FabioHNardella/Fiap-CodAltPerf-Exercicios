package Exercicio04;

import Exercicio02.pilhas.PilhaInt;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaInt pilha = new PilhaInt();
        int[] aux = new int[pilha.N];
        pilha.init();
        int digito;

        System.out.print("Informe o digito (0 a 9): ");
        digito = sc.nextInt();
        System.out.println("");
        int n = 0;
        while (digito >= 0) {
            aux[n] = digito;
            n++;
            pilha.push(digito);
            System.out.println("Informe o digito (0 a 9): ");
            digito = sc.nextInt();
        }

        boolean palindromo = true;
        for (int i = 0; i < n && palindromo; i++) {
            if (aux[i] != pilha.pop()) {
                palindromo = false;
            }
        }
        if (palindromo) {
            System.out.println("Este numero e um palindromo");
        } else {
            System.out.println("Este numero nao e um palindromo");
        }
    }
}
