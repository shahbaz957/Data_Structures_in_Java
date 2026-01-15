import java.util.Stack;

public class Main {
    public static void main(String[] args){
        String str = "Shahbaz";
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()){
            st.push(ch);
        }
        while (!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
