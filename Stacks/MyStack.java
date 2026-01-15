public class MyStack {
    private int[] items;
    private int top;
    private int size;

    public MyStack(int size) {
        this.items = new int[size];
        this.size = size;
        this.top = 0;
    }

    public void push(int value){
        if(top == size){
            System.out.println("stack is full");
            return ;
        }
        this.items[top] = value;
        top++;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public void show(){
        for (int i = top-1 ; i >= 0 ; i--){
            System.out.println(this.items[i]);
        }
    }

    public int pop() {
        if (top == 0){
            System.out.println("Stack is Empty");
            return -1;
        }
        return this.items[this.top--];
    }
}
