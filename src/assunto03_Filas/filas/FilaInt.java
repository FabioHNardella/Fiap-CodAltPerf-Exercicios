package assunto03_Filas.filas;

public class FilaInt {

    final int N = 3;
    int[] dados = new int[N];
    int ini, fim, cont;

    public void init() {
        ini = fim = cont = 0;
    }

    public boolean isEmpty() {
        return (cont == 0);
    }

    public boolean isFull() {
        return (cont == N);
    }

    public void enqueue(int elem) {
        if (!isFull()) {
            dados[fim] = elem;
            cont++;
            fim = (fim + 1) % N;
        } else
            System.out.println("Queue is full!");
    }

    public int dequeue() {
        int elem = dados[ini];
        ini = (ini + 1) % N;
        cont--;
        return elem;
    }

    public int first() {
        return (dados[ini]);
    }


}
