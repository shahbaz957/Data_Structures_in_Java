
import java.util.Stack;

public class QueueInStack {

    private Stack<Integer> st;

    public QueueInStack() {
        st = new Stack<>();
    }

    public void enqueue(int val) {
        st.push(val);
    }

    public int dequeue() {
        if (st.size() == 1) {
            return st.pop();
        }
        int temp = st.pop();
        int res = dequeue();
        st.push(temp);
        return res;
    }

    public String show() {
        return st.toString();
    }
}
