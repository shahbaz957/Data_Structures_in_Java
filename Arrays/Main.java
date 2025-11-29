package Arrays;

public class Main {
    public static void main(String args[]){
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 42;
        arr[3] = 6;
        arr[4] = 7;
        for (int i = 0  ; i < 5 ; i++){
            System.out.println(arr[i]);
        }

		deletion.delete();
		My_list.list();
        MyArray arr1 = new MyArray(5);
        arr1.insert(6);
        arr1.insert(7);
        arr1.insert(2);
        arr1.insert(9);
        arr1.insert(12);
        arr1.insert(13);
        arr1.insert(17); 
        // System.out.println(arr.index(12));
        // arr.remove(6);
        // arr.reverse();
        arr1    .print();


        


    }
}
