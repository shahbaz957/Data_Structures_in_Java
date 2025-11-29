package MyLinkedList;

class Node {

    public int data;
    public Node next = null;

    public Node(int value, Node next) {
        data = value;
        this.next = next;
    }

    public Node(int value) {
        this(value, null);
    }
}

public class MyLinkedList {

    private Node head;
    private Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;

    }

    public void insert(int value) {
        Node n = new Node(value);
        if (head == null) {
            head = n;
            tail = n;
            return;
        }

        // Node temp = head;
        // while (temp.next != null) {
        //     temp = temp.next;
        // }
        // temp.next = n;
        // tail = temp.next;
        tail.next = n; // previously tail.next was null 

        tail = n;  // Now we have moved the pointer tail to the last node 
    }

    public void show() {
        // Node temp = head;
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.println(temp.data);
        }
    }

    public void deleteLastNode() {
        if (head == null) {
            System.out.println("No Node to Delete");
            return;
        }

        if (head == tail) { // Only have one Node        
            head = null;
            tail = null;
            return;
        }

        // Node temp = head;
        // while (temp.next.next != null){
        //     temp = temp.next;
        // }
        // temp.next = null;
        // tail = temp.next;
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        // In case of Tails we just have to Focus on TAILS and keep track of tails
    }

    public int sumList() {
        int sum = 0;
        Node temp = head;
        while (temp.next != null) {

            sum += temp.data;
            temp = temp.next;
        }
        sum += temp.data;
        return sum;
    }

    public void insertAtBeg(int value) {
        head = new Node(value, head);
    }

    public void insertAtidx(int value, int idx) {
        Node n = new Node(value);
        if (idx == 0) {
            insertAtBeg(value);
            return;
        }
        int i = 1;
        Node temp = head;
        while (i != idx && temp.next != null) {
            i++;
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;

    }
}
