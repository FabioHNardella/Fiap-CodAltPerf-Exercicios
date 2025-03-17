import java.util.Scanner;

public class Aluno {
    String nome;
    int rm;
    double nota1, nota2, media;

    public void leitura() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Nome: ");
        nome = scan.next();
        System.out.print("RM: ");
        rm = scan.nextInt();
        System.out.print("Nota1: ");
        nota1 = scan.nextDouble();
        System.out.print("Nota1: ");
        nota2 = scan.nextDouble();
    }

    public void calcularMedia() {
        media = (nota1 + nota2) / 2;
    }

    public void apresentar() {
        System.out.println("Aluno: " + nome + "\t RM: " + rm);
        System.out.println("Nota 1: " + nota1 + "\t Nota 2: " + nota2);
        System.out.println("Media: " + media);
    }
}
