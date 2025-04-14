package assunto03_Filas.filas;

public class FilaString {
    final int N = 3;
    String[] dados = new String[N];
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

    public void enqueue(String elem) {
        if (!isFull()) {
            dados[fim] = elem;
            cont++;
            fim = (fim + 1) % N;
        } else
            System.out.println("Queue is full!");
    }

    public String dequeue() {
        String elem = dados[ini];
        ini = (ini + 1) % N;
        cont--;
        return elem;
    }

    public String first() {
        return (dados[ini]);
    }
}
