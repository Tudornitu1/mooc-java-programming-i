import java.util.ArrayList;

public class Stack {
    ArrayList stack = new ArrayList<>();
    public boolean isEmpty(){
        if(stack.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
    public void add(String value){
        stack.add(value);
    }
    public ArrayList<String> values(){
        return stack;
    }

    public String take(){
        String x=stack.get(stack.size()-1).toString();
        stack.remove(stack.get(stack.size()-1));
        return x;
    }
}
