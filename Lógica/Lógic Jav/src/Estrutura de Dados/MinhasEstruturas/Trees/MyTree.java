package MinhasEstruturas.Trees;

public class MyTree<T> {
    Node<T> root;

    public MyTree(T valorRaiz) {
        root = new Node<>(valorRaiz);
    }

    public void add(Node<T> no, T valor){
        Node<T> filho = new Node<>(valor);
        no.filhos.add(filho);
    }

}
