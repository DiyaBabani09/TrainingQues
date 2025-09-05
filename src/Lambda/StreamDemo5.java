package Lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo5 {
    public static void main(String[] args) {
//        List<Character> list= Arrays.asList('1','2','3','3','5');
//        //converting into set
//        System.out.println(list.stream().collect(Collectors.toSet()));


//joining two String
//        List<String>list=Arrays.asList(" Diya","Babani");
//        System.out.println(list.stream().collect(Collectors.joining(" , ")));

        //summarizing
// List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8) ;
//    IntSummaryStatistics stat = list.stream()
//            .collect(Collectors.summarizingInt(x->x));
//        System.out.println(stat.getSum());
//        System.out.println(stat.getMax());
//        System.out.println(stat.getAverage());
//        System.out.println(stat.getCount());
//    }
//}
        List<String>list=Arrays.asList(" Diya","Babani","Riya");
        System.out.println(list.stream().
                collect(Collectors.groupingBy(x->x.length())));
    }
    }