package Arrays;

public class deletion {
    public static void delete(){
        int[] arr = new int[5];
        for (int i = 0 ; i < 5 ;i++){
            arr[i] = i+1;
        }
        int n = 5;
        int idx = 1;
        // int temp = arr[idx];
        arr[idx] = arr[n-1];
        arr[n-1] = 0 ;
        for (int i = 0 ; i < n-1 ; i++){
            System.out.println(arr[i]);
        }
  
    }
}
