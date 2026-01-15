
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        System.out.println(q);
        // now reverse this queue not just for printing purpose
        Stack<Integer> st = new Stack<>();
        Integer num = q.poll();
        while (num != null){
            st.push(num);
            num = q.poll();
        }
        // Queue<Integer> tmp = new ArrayDeque<>();
        
        while (!st.isEmpty()){
            q.offer(st.peek());
            st.pop();
        }
        System.out.println(q);

    }
}
