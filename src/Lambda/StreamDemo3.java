package Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<Student> st = Arrays.asList(
                new Student("Diya", 21),
                new Student("Anish", 43),
                new Student("priya", 43),
                new Student("Moni", 5),
                new Student("Abhi", 2)


        );


//        st.stream().filter(Student -> Student.getName().startsWith("A")).toList().forEach(System.out::println);


//        st.stream().filter(Student->Student.getName().startsWith("A")).toList().forEach(Student->System.out.println(Student.getName()));

//        List<String>Name=st.stream().map(Student->Student.getName().toUpperCase()).toList();
//        System.out.println(Name);

//st.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getAge)).toList().forEach(System.out::println);

List<Student> words=st.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(words);

    }

}