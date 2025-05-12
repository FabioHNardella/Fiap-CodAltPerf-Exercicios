package assunto07_ListasEncadeadasGenericas;

public class ListaIntCrescente {
    private class NO{
        int dado;
        NO prox;
    }

    private NO lista = null;

    public void inserir(int i){
        NO novo = new NO();
        novo.dado = i;
        if(lista == null){
            lista = novo;
            novo.prox = null;
        } else if(novo.dado < lista.dado){
            novo.prox = lista;
            lista = novo;
        } else{
            NO aux = lista;
            boolean achou = false;
            while(aux.prox != null && !achou){
                if(aux.prox.dado < novo.dado){
                    aux = aux.prox;
                } else{
                    achou = true;
                }
            }
            novo.prox = aux.prox;
            aux.prox = novo;

        }
    }

    public boolean remover(int i){
        if(lista == null){
            System.out.println("Lista vazia");
            return false;
        } else if(i == lista.dado){
            lista = lista.prox;
            return true;
        }
        else {
            NO aux = lista;
            boolean achou = false;
            while(aux.prox != null && achou == false){
                if(aux.prox.dado == i){
                    aux = aux.prox;
                } else{
                    achou = true;
                }
                aux.prox = aux.prox.prox;
                return true;
            }
        }
        return false;
    }

    public void mostrar(){
        System.out.println("---*** Elementos da lista ***---");
        NO aux = lista;
        while(aux != null){
            System.out.print(aux.dado+ "\t");
            aux = aux.prox;
        }
        System.out.println("\n---------------------------------");
    }
}
