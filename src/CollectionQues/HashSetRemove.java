package CollectionQues;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetRemove {
    public static void main(String[] args) {

        HashSet<Integer> set1=new HashSet<>(Arrays.asList(1,3,6,9,2,7 ));
        HashSet<Integer> set2=new HashSet<>(Arrays.asList(9,0,2,4));

        boolean b =set1.removeAll(set2);
        System.out.println(b);
        System.out.println(set1);

    }
}
