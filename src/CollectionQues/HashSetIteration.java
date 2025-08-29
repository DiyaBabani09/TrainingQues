package CollectionQues;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 6, 9, 2, 7));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 8, 9, 1, 2, 4));
        Iterator it = set1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Iterator value = set2.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }

    }
}
