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

    public void remove(T valor) {
        this.root = remove(this.root, valor);
    }

    private Node<T> remove(Node<T> node, T valor) {
        if (node == null) {
            return null;
        }

        int comparacao = valor.compareTo(node.valor);

        if (comparacao < 0) {
            node.esquerdo = remove(node.esquerdo, valor);
        } else if (comparacao > 0) {
            node.direito = remove(node.direito, valor);
        
        } else {

            if (node.esquerdo == null) {
                return node.direito;
            }
            
            if (node.direito == null) {
                return node.esquerdo;
            }

            Node<T> sucessor = findMin(node.direito);
            
            node.valor = sucessor.valor;
            
            node.direito = remove(node.direito, sucessor.valor);
        }

        return node;
    }

    private Node<T> findMin(Node<T> node) {
        Node<T> current = node;
        while (current.esquerdo != null) {
            current = current.esquerdo;
        }
        return current;
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
