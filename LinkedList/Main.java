package LinkedList;

import java.util.List;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(4);
        list.add(6);
        list.add(2);
        list.remove(2);
        list.addFirst(78);
        System.out.println(list);
    }
}
