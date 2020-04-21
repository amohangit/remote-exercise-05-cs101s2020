import java.util.ArrayList;
public class CLinks extends ArrayList{
    private ArrayList<Integer> stack;
    CLinks(){
        stack = new ArrayList<Integer>();
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