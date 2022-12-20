import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyClass {
    LinkedList<Integer> list = new LinkedList<>();
    public void enqueue(int x){
        list.add(x);
    }

    public Integer dequeue(){
        int first = list.get(0);
        list.remove(0);
        return first;
    }

    public Integer first(){
        int first = list.get(0);
        return first;
    }

    public List<Integer> getList(){
        return list;
    }
}