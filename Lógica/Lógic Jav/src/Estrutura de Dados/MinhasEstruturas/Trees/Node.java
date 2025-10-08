package MinhasEstruturas.Trees;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    T valor;
    List<Node<T>> filhos;

    Node(T valor){
        this.valor = valor;
        filhos = new ArrayList<>();
    }

}
