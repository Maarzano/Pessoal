package Revisao;

import MinhasEstruturas.PriorityQueue.MyPriorityQueue;

public class testandoMyPriorityQueue {
    public static void main(String[] args) {
        MyPriorityQueue<Integer> pQueue = new MyPriorityQueue<>();

        pQueue.insert(1);
        pQueue.insert(3);
        pQueue.insert(2);

        System.out.println(pQueue.extractMax());
    }

}
