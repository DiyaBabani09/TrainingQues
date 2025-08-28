package CollectionQues;

import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        LinkedList<Integer>l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        for(int i:l){
            System.out.println(i);
        }
    }
}
