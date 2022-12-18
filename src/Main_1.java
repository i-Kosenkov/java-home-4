import java.util.Arrays;
import java.util.LinkedList;

public class Main_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        for (int i = list.size(); i > 0; i--) {
            System.out.print(list.get(i - 1) + " ");
        }

    }
}