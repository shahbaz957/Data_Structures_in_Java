class Node {

    public int data;
    public Node next = null;

    public Node(int val) {
        this(val, null);
    }

    public Node(int val, Node next) {
        this.data = val;
        this.next = next;
    }

}

public class MyQueue {

    public Node head;

    public MyQueue() {
        head = null;
    }

    public MyQueue(int data) {
        head = null;
    }

    public void enqueue(int data) {
        if (head == null) {
            head = new Node(data);
            return ;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }
    public int dequeue(){
        if (head == null){
            System.out.println("Queue is Empty !!!");
            return -1;
        }
        Node temp = head;
        this.head = head.next;
        return temp.data;
    }

    public void show(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
