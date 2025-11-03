package MinhasEstruturas.Trees.BinaryTree;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class MyBinaryTree<T extends Comparable<T>> implements Iterable<T>{
    Node<T> root;

    public MyBinaryTree(T valor){
        this.root = new Node<>(valor);
    }

    public MyBinaryTree(){
        this.root = new Node<>(null);
    }

    public boolean search(T valor) {
        if (root == null || root.valor == null) {
            return false;
        }

        Node<T> current = root;
        while (current != null) {
            int comparacao = valor.compareTo(current.valor);

            if (comparacao == 0) {
                return true;
            } else if (comparacao < 0) {
                current = current.esquerdo;
            } else {
                current = current.direito;
            }
        }

        return false;
    }

    public void add(T valor) {
        Node<T> novoNode = new Node<>(valor);

        if (this.root == null) {
            this.root = novoNode;
            return;
        }

        Node<T> current = this.root;

        while (true) {
            int comparacao = valor.compareTo(current.valor);

            if (comparacao < 0) {
                if (current.esquerdo == null) {
                    current.esquerdo = novoNode;
                    return;
                }
                current = current.esquerdo;

            } else if (comparacao > 0) {
                if (current.direito == null) {
                    current.direito = novoNode;
                    return;
                }
                current = current.direito;
            
            } else {
                return;
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Stack<Node<T>> stack = new Stack<>();

            {
                pushLeftChildren(root);
            }

            @Override
            public boolean hasNext() {
                return !stack.isEmpty();
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("A árvore não tem mais elementos.");
                }

                Node<T> nodeToReturn = stack.pop();

                if (nodeToReturn.direito != null) {
                    pushLeftChildren(nodeToReturn.direito);
                }

                return nodeToReturn.valor;
            }

            private void pushLeftChildren(Node<T> node) {
                while (node != null) {
                    stack.push(node);
                    node = node.esquerdo;
                }
            }
        };
    }

}
