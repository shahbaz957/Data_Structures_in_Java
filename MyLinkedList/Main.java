package MyLinkedList;

public class Main {
    public static void main(String[] args){
        MyLinkedList ll = new MyLinkedList();
        ll.insert(45);
        ll.insert(23);
        ll.insert(35);
        ll.insert(75);
        ll.insert(49);
        // ll.insertAtBeg(234);
        // System.out.println(ll.toString());
        // ll.deleteLastNode();
        ll.insertAtidx(123, 2);
        ll.show();

        // System.err.println(ll.sumList());
    }
}
