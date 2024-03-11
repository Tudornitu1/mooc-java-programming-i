import java.util.ArrayList;

public class TodoList {
    private ArrayList <String> todolist;
    public TodoList(){
        this.todolist=new ArrayList<>();
    }
    public void add(String task){
        todolist.add(task);
    }
    public void print(){
        int k=1;
        for(String task:todolist){
        System.out.println(k+": "+task);
        k++;
        }
    }
    public void remove(int number){
        todolist.remove(number-1);
    }
}
