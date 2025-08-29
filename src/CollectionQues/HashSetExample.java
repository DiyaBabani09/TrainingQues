package CollectionQues;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedMap;

public class HashSetExample {


    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(8);
        HashSet<Integer> set1=new HashSet<>(Arrays.asList(1,3,6,9,2,7 ));
        HashSet<Integer> set2=new HashSet<>(Arrays.asList(3,8,9,1,2,4));

         boolean b =set1.removeAll(set2);
        System.out.println(b);
        System.out.println(set1);
//        Iterator it= set1.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

//        System.out.println("hashcode value is : " +s.hashCode());

//        boolean b=set1.retainAll(set2);
//        System.out.println(" was the set modified  "+ b);
//        // already modified then not work again
//        System.out.println(set1.retainAll(set2));
//        System.out.println(set1);
//
//boolean ans =set1.containsAll(set2);
//        System.out.println(ans);

//        for(int i:s){
//            System.out.println(i);
//        }
//       Object[] arr = s.toArray();
//        int target=9;
//        if(s.contains(target)){
//            System.out.println(" element is found");
//        }
//        else{
//            System.out.println("element is not found");
//        }
    }
}
