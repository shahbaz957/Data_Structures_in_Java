public class Main {
    public static void main(String[] args){
        MyStack st = new MyStack(5);
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(12);
        st.push(12);
//        st.push(12);
        st.pop();
        st.pop();
        st.pop();
        st.show();
    }
}
