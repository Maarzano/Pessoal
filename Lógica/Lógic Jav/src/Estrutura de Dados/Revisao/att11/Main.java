package Revisao.att11;

import java.util.PriorityQueue;

public class Main {
    PriorityQueue<Task> p = new PriorityQueue<>((t1, t2) -> t2.priority - t1.priority);

}
