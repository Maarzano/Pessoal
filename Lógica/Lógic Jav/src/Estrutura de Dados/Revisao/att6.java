package Revisao;

import java.util.Arrays;
import java.util.PriorityQueue;

public class att6 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{5, 7, 2, 8, 2, 9, 12, 5, 2};

        System.out.println(findKthLargest(array, 3));
        
    }
    public static int findKthLargest(Integer[] nums, int k){
        PriorityQueue<Integer> fila = new PriorityQueue<>(Arrays.asList(nums));
        
        while(fila.size() > k){
            fila.poll();
        }
        return fila.peek();
    }

}
