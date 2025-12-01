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

    public void showWithHead(Node head){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp= temp.next;
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
        // if (idx == 0) {
        //     insertAtBeg(value);
        //     return;
        // }
        // int i = 1;
        // Node temp = head;
        // while (i != idx && temp.next != null) {
        //     i++;
        //     temp = temp.next;
        // }
        // n.next = temp.next;
        // temp.next = n;

        // ***************************** Another Way *******************************

        if (head == null){
            System.out.println("Linked List is Empty !!!");
        }
        // Node n = new Node(value);
        Node prev = null;
        Node cur = head;
        while (idx > 0 && cur != null){
            prev = cur;
            cur = cur.next;
            idx--;
        }

        prev.next = n ;
        n.next = cur;


    }

    public void reverseLL(){
        Node prev = null;
        Node next = null;
        Node curr = head;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void DeleteAtBeg(){
        Node temp = head.next; 
        // previous head is automatically removed by java garbage Collector which you have to do manually in C++
        head = temp;
    }

    public void printRec(Node h){
        // this is the base condition for recursion
        if (h == null){
            return ;
        }

        System.out.println(h.data);

        printRec(h.next);
    }

    public void printRecRev(Node h){
        if (h == null){
            return ;
        }
        printRecRev(h.next);
        System.out.println(h.data);
    }

    // Make a wrapper function to call this recursive method dont make your head as public

    public void printRec(){
        printRec(head);
    }

    public void printRecRev(){
        printRecRev(head);
    }


    public Node RecRev(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node rest = RecRev(head.next); // this will preserve the head of the New Reversed Linked List 

        Node next = head.next;
        next.next = head;
        head.next = null;
        return rest;


    }
    public Node RecRev(){
        Node n = RecRev(head);
        return n;
    }
}
