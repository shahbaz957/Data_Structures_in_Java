import java.util.Arrays;
public class PriorityQueue {
    private int[] items;
    private int front;
    private int rear;
    private int size;
    private int count;

    public PriorityQueue(int cap) {
        this.items = new int[cap]; // allocate the array of this much capacity
        this.front = -1;
        this.rear = 0;
        this.size = cap;
        this.count = 0;
    }

    public void enqueue(int num) {
        if (count == size) {
            System.out.println("Queue is Full");
            return;
        }
        int i ;
        for (i = rear ; i > 0 ; i--){
            if (items[i-1] > num){
                items[i] = items[i-1];
            }
            if(items[i-1] <= num){
                break;
            }
        }
        items[i] = num;
        rear = (rear + 1) % size;
        count++;
    }

    public int dequeue() {
        if (this.count == 0) {
            System.out.println("No more Element to Dequeue");
            return -1;
        }
        front = (front + 1) % size;
        int num = this.items[front];
        this.items[front] = 0;
        count--;
        return num;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }

    public String s_show() {
        return Arrays.toString(items);
    }
}
