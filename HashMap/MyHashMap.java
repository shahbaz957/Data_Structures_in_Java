
import java.util.LinkedList;
import java.util.Arrays;

class Entry {

    public Integer key;
    public String value;

    public Entry(int key, String val) {
        this.key = key;
        this.value = val;
    }

    public String toString() {
        return key + " = " + value;
    }
}

public class MyHashMap {

    // first we gonna create an array of LinkedList means at each element of array it contain point to the head of LInkedLIst
    LinkedList<Entry>[] list;

    public MyHashMap(int value) {
        this.list = new LinkedList[value];
    }

    public boolean put(int key, String value) {
        int idx = HashKey(key);
        if (this.list[idx] == null) {
            list[idx] = new LinkedList<>();
        }
        var bucket = list[idx]; // java compiler automatically infer that the type of bucket is LINKEDLIST
        bucket.addLast(new Entry(key, value));
        return true;
    }

    private int HashKey(int key) {
        return key % this.list.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }

}
