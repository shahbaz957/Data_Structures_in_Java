package Arrays;

import java.util.List;
import java.util.ArrayList;

public class My_list {
    public static void list() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(1);
        for (int i = 0 ; i < 4 ; i++){
            System.out.println(list.get(i));
        }
    }
}
