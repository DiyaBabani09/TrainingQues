package Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterface1 {
    public static void main(String[] args) {
        Employee e = () -> {
            System.out.println("java Developer");
            return "diya";
        };
        System.out.println(e.getName());


        operational o = (a, b) -> {
            return a + b;
        };
        operational o1 = (a, b) -> {
            return a - b;
        };
        operational o2 = (c, d) -> {
            return c * d;
        };
        System.out.println("a + b =" + o.calculator(5,7));
        System.out.println("a- b ="+ o1.calculator(5,3));
        System.out.println("a*b =" + o2.calculator(9,8));
        //Consumer Interface
        Consumer<Integer>display=a->{
            System.out.println(a);
        };
        display.accept(10);

        Predicate<Integer>printing =b->(b<18);
        System.out.println(printing.test(1));

        Function<Integer,Integer> half=a->a*3;
        Function<Integer,Integer> doubleiT=a->a*a;
//        half = doubleiT.andThen(half);
        System.out.println(doubleiT.compose(half).apply(10));

        System.out.println(half.apply(20));








    }
}