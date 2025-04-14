package assunto02_Pilhas.Exercicio01;

public class Main {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        a1.leitura();
        a1.calcularMedia();
        a2.leitura();
        a2.calcularMedia();
        System.out.println("\nApresentação dos alunos");
        a1.apresentar();
        a2.apresentar();
    }
}
