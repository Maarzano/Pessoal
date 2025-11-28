package MinhasEstruturas.PriorityQueue;

import java.util.ArrayList;
import java.util.List;

public class MyPriorityQueue<T extends Comparable<T>> {
    private List<T> heap;

    public MyPriorityQueue() {
        this.heap = new ArrayList<>();
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public T peek() {
        if (isEmpty()) return null;
        return heap.get(0);
    }

    public void insert(T element) {
        heap.add(element);
        
        siftUp(heap.size() - 1);
    }

    public T extractMax() {
        if (isEmpty()) return null;

        T maxElement = heap.get(0);

        T lastElement = heap.remove(heap.size() - 1);

        if (!isEmpty()) {
            heap.set(0, lastElement);
            siftDown(0);
        }

        return maxElement;
    }

    private void siftUp(int index) {
        int parentIndex = (index - 1) / 2;

        while (index > 0 && heap.get(index).compareTo(heap.get(parentIndex)) > 0) {
            swap(index, parentIndex);
            
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void siftDown(int index) {
        int maxIndex = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int size = heap.size();

        if (leftChild < size && heap.get(leftChild).compareTo(heap.get(maxIndex)) > 0) {
            maxIndex = leftChild;
        }

        if (rightChild < size && heap.get(rightChild).compareTo(heap.get(maxIndex)) > 0) {
            maxIndex = rightChild;
        }

        if (index != maxIndex) {
            swap(index, maxIndex);
            siftDown(maxIndex);
        }
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    
    @Override
    public String toString() {
        return heap.toString();
    }
}
