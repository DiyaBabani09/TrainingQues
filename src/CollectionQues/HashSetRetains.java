package CollectionQues;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetRetains {
    public static void main(String[] args) {  HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 6, 9, 2, 7));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 8, 9, 1, 2, 4));
        boolean b=set1.retainAll(set2);
        System.out.println(" was the set modified  "+ b);
        // already modified then not work again
        System.out.println(set1.retainAll(set2));
        System.out.println(set1);

    }
}
