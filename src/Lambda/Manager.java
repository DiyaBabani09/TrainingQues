package Lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class Manager implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }

    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.sort(new Manager());
        System.out.println(a);

    }
}
