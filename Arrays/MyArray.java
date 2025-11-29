package Arrays;

public class MyArray {

    private int[] arr;
    private int size ;
    private int curSize;

    public MyArray(int size) {
        this.arr = new int[size];
        this.curSize = 0;
        this.size = size;
    }

    public void insert(int num) {
        if (curSize >= size){
            MyArray new_arr = new MyArray(size * 2);
            for (int i = 0 ; i< curSize ; i++){
                new_arr.arr[i] = this.arr[i];
            }
            this.arr = new_arr.arr;
            this.size = size*2;
        }
        
        this.arr[curSize++] = num;
    }

    public String toString() {
        String str = new String();
        for (int num : this.arr) {
            str = str + (num + " , ");
        }
        return str;
    }

    public void print() {
        for (int i = 0; i < this.curSize; i++) {
            System.out.println(this.arr[i]);
        }
    }

    public int index(int num) {
        for (int i = 0; i < curSize; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int num) {
        for (int i = 0; i < curSize; i++) {
            if (arr[i] == num) {
                for (int j = i; j < curSize - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                curSize--; // this method also save the order of elements
                break;
            }
        }
    }

    public void reverse() {
        int st = 0;
        int end = curSize - 1;
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
}
