package Lambda;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streamques {
    public static void main(String[] args) {
        //ques1
        List<String> a= Arrays.asList("Apple","banana"," mango","kiwi");
//       Optional<String> ans= a.stream().max(Comparator.comparing(String::length));
//        System.out.println(ans.get());

        //ques2 using comparisom
a.stream().sorted((s,s1)->s1.compareTo(s)).toList().
        forEach(i-> System.out.println(i));


        //get all result
        System.out.println(a.stream().sorted(Comparator.reverseOrder()).toList())  ;
        //qus2
        Student s3=new Student("diya",21);
        Student s1=new Student("Moni",71);
        Student s2=new Student("priya",20);
        ArrayList<Student> list=new ArrayList<>();
        list.add(s3);
        list.add(s2);
        list.add(s1);
        System.out.println( list.stream().mapToInt(Student::getAge).average().getAsDouble());


        // ques 4 intersection between to list
        List<Integer>l1=Arrays.asList(1,2,3,4,5,6);
        List<Integer>l2=Arrays.asList(9,0,4,5,6);
        System.out.println(l1.stream().filter(l2::contains).toList());

        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
        Map<String,Long> freq=words.stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(freq);









    }
}
