package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StremoDemo2 {
    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(1,2,3,3);
        System.out.println(  a.stream().skip(2).toList());
        a.forEach(System.out::println);

    }
}
