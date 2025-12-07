class Node{
    public int data ;
    public Node next = null;
    public Node(int data , Node next ){
        this.data = data;
        this.next = next;
    }
    public Node (int data ){
        this(data , null);
    }
}
public class StackInLL {
    public Node head;

    public StackInLL(){
        head = null;
    }
    public void push(int value){
        head = new Node(value , head);
    }
    public int pop(){
        if (head == null){
            System.out.println("Stack is Already Empty");
            return -1;
        }
        Node tmp = head;
        head = head.next;
        return tmp.data;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int peek(){
        return head.data;
    }

    public void show(){
        if (head == null){
            System.out.println("Stack is empty");
            return ;
        }
        Node tmp = head;
        while (tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}
