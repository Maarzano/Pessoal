import java.util.Stack;
import MinhasEstruturas.LinkedList.Single.SinglyLinkedList;

public class att44 {
    public static void main(String[] args) {

        SinglyLinkedList<Integer> listapronta = inverterPrimeirosK(new SinglyLinkedList<>(new Integer[]{1, 2, 3, 4, 5}), 2);

        listapronta.printList();
        
    }

    public static <T extends Comparable<T>> SinglyLinkedList<T> inverterPrimeirosK(SinglyLinkedList<T> lista, int k){
        Stack<T> pilha = new Stack<>();
        SinglyLinkedList<T> resultado = new SinglyLinkedList<>();

        int count = 0;
    for (T valor : lista) {
        if (count < k) {
            pilha.push(valor);
        } else {
            while (!pilha.isEmpty()) {
                resultado.add(pilha.pop());
            }
            resultado.add(valor);
        }
        count++;
    }

    while (!pilha.isEmpty()) {
        resultado.add(pilha.pop());
    }

    return resultado;
    }

}
