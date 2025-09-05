package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StremoDemo2 {
    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(1,2,3,3);
        List<String>words=Arrays.asList("Hello","Diya","Hi","good");
//        System.out.println(  a.stream().skip(2).toList());
//        a.forEach(System.out::println);
        //map
        System.out.println(a.stream().map(x->x*x).sorted().toList());
        //filter
        System.out.println(words.stream().filter(w->w.length()>3).toList());
        //reduce
        System.out.println(a.stream().reduce(Integer::sum).get());

//        String sentence="HelloWords";
//        System.out.println(sentence.chars().filter(x->x=='l').count());


        //peek()
        Stream.iterate(1,x->x+1).limit(10).skip(2).
                peek(System.out::println).count();
        System.out.println(Stream.of(1,2,3,4,6,0)
                .max(Comparator.naturalOrder()));


        List<String>sen=Arrays.asList("Hello world",
                "java is powerful",
                "hello diya");
        System.out.println(sen.stream().
                flatMap(sent->Arrays.stream(sent.split(" ")).
                        map(String::toUpperCase)).toList()
        );
        // work with multiple list
//        System.out.println(sen.get(1).get(1));
    }
}
