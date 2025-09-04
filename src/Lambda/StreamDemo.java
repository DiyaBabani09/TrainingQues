package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        int arr[]={3,8,9,7,1};
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
//        System.out.println(a.stream().filter(x->x%2==0).count());
       IntStream s= Arrays.stream(arr,1,3);
//       s.forEach(x->{
//           System.out.println(x);
//       });
        s.forEach(System.out::println);
//        Stream<String>s2=Stream.of("abc","b","ac");
//        System.out.println(s2.filter(x->x.startsWith("a")).count());

        //method4
        Stream.generate(new Random():: nextInt).distinct().limit(5).forEach(System.out::println);
Stream<String>s4=Stream.generate(()->"constant");
s4.limit(5).forEach(System.out::println);
    }
}
