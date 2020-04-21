import java.util.Vector;
public class DLinks extends Vector{
    private Vector<Integer> stack;
    DLinks(){
        stack = new Vector<Integer>();
    }
    public void push(int data){
        stack.add(data);
    }
    public int pop(){
        return stack.remove(stack.size()-1);
    }
    public int peek(){
        return stack.get(stack.size()-1);
    }
    public int size(){
        return stack.size();
    }
}