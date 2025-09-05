package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo7 {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Apple","Banana","Mango");
        System.out.println(words.stream().
                collect(Collectors.toMap(x->x.toUpperCase(),
                        x->x.length())));
    }
}
