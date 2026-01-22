import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        // System.out.println("Hello world i am mirza shahbaz ali Baig");
        // Queue<Integer> queue = new ArrayDeque<>();
        // queue.add(3);
        // queue.add(4);
        // queue.add(5);
        // queue.add(6);
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue);
        // MyQueue q = new MyQueue();
        // q.enqueue(23);
        // q.enqueue(25);
        // q.enqueue(22);
        // q.enqueue(26);
        // q.enqueue(10);
        // q.dequeue();
        // q.show();
        // MyQueueArr queue = new MyQueueArr(5);
        // queue.enqueue(1);
        // queue.enqueue(2);
        // queue.enqueue(3);
        // queue.enqueue(4);
        // queue.enqueue(5);
        // queue.dequeue();
        // queue.dequeue();
        // queue.dequeue();
        // queue.enqueue(25);
        // queue.enqueue(25);
        // queue.enqueue(25);
        // queue.enqueue(25);
        // queue.dequeue();
        // queue.enqueue(55);
        // System.out.println(queue.s_show());

        // QueueInStack queue = new QueueInStack();
        // queue.enqueue(23);
        // queue.enqueue(24);
        // queue.enqueue(25);
        // queue.enqueue(26);
        // queue.enqueue(27);
        // queue.dequeue();
        // queue.dequeue();
        // queue.dequeue();
        // System.out.println(queue.show());

        // PriorityQueue queue = new PriorityQueue(10);
        // queue.enqueue(5);
        // queue.enqueue(1);
        // queue.enqueue(78);
        // queue.enqueue(90);
        // queue.dequeue();
        // queue.enqueue(54);
        // queue.dequeue();
        // System.out.println(queue.s_show());
        // so the priority queue is sth like array storing the element in asc order but it has different implementation depending upon the task that is implemented using that structure
        Queue<Integer> q = new LinkedList<>();
        q.offer(34);
        q.offer(35);
        q.offer(36);
        q.offer(37);
        System.out.println(q);
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()){
            s.push(q.poll());
        }
        while (!s.isEmpty()){
            q.offer(s.pop());
        }
        System.out.println(q);
    }
}