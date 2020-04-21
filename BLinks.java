import java.util.Stack;
public class BLinks{
    private Stack<Integer> stack;
    BLinks(){
         stack = new Stack<Integer>();
    }
    public void push(int data){
        stack.push(data);
    }
    public int pop(){
        return stack.pop();
    }
    public int peek(){
        return stack.peek();
    }
    public int size(){
        return stack.size();
    }
}