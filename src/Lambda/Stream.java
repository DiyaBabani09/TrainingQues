package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collector.*;

public class Stream {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("diya","Monika","priya","annu");
        //partitoning
        System.out.println(list.stream().
                collect(Collectors.partitioningBy(a->a.length()>5)));

        //grouping
        System.out.println(list.stream().
                collect(Collectors.groupingBy(x->x.length())));



        //counting words
        List<String>word=Arrays.asList("Hello","world","Hello","hii");
        System.out.println(word.stream().
                collect(Collectors.groupingBy(x->x,Collectors.counting())));





    }
}
