package MinhasEstruturas.Trees.BinaryTree;

public class MyBinaryTree<T> {
    Node<T> root;

    public MyBinaryTree(T valor){
        this.root = new Node<>(valor);
    }

    public MyBinaryTree(){
        this.root = new Node<>(null);
    }

/*  public boolean Search(T valor){
        TODO implementar
    }*/

}
