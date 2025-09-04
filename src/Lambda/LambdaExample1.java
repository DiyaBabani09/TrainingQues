package Lambda;

import java.util.ArrayList;
interface  Display{
    void method1();
//    String Method2();
        }
        interface Displaysize{
    int size();
        }
public class LambdaExample1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(6);
        a.forEach(n -> System.out.println(n));
        System.out.println("odd element");
        a.forEach(n -> {
            if (n % 2 != 0) {
                System.out.println(n);
            }
        });
        Display d=()-> System.out.println("method1");
        d.method1();

    Displaysize d1=()->a.size();
        System.out.println(d1.size());
}
}