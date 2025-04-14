package assunto02_Pilhas.Exercicio02.pilhas;

public class PilhaInt {

	public final int N = 8;
	int[] dados = new int[N];
	int topo;

	public void init() {
		topo = 0;
	}

	public boolean isFull() {
		return (topo == N);
	}

	public boolean isEmpty() {
		return (topo == 0);
	}

	public void push(int elem) {
		if (isFull())
			System.out.println("Satck overflow");
		else {
			dados[topo] = elem;
			topo++;
		}
	}

	public int pop() {
		topo--;
		return (dados[topo]);
	}

	public int top() {
		return dados[topo - 1];
	}

	public void empty() {
		while (!isEmpty()) {
			System.out.print(pop() + "\t");
		}
	}
}
