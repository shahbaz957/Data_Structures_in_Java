import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        // Map<Integer , String> map = new HashMap<>();
        // map.put(1 , "Shahbaz");
        // map.put(2 , "Ali");
        // map.put(3 , "Baig");
        // map.put(null , null);
        // System.out.println(map.containsKey(null));
        // System.out.println(map);
        MyHashMap map = new MyHashMap(5);
        map.put(1 , "Shahbaz");
        map.put(2 , "Hamza");
        map.put(6 , "Ali");
        System.out.println(map.toString());
    }
}
