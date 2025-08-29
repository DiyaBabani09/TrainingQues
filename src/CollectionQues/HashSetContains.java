package CollectionQues;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetContains {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 6, 9, 2, 7));
        int target =8;
        if(set1.contains(target)){
        System.out.println(" element is found");
        }
        else{
            System.out.println("element is not found");
        }
    }
}
