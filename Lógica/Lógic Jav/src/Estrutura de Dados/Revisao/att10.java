package Revisao;

import MinhasEstruturas.Trees.BinaryTree.MyBinaryTree;

public class att10 {
    public static void main(String[] args) {
        MyBinaryTree<Integer> t = new MyBinaryTree<>(100);
        t.add(120);
        t.add(143);
        System.out.println(t.search(100));
    }
}
