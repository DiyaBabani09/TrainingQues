package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.SortedMap;

public class FunctionalInterface3 {
    public static void main(String[] args) {
        Student s3=new Student("diya",21);
        Student s1=new Student("Moni",71);
        Student s2=new Student("priya",20);
        ArrayList<Student>a=new ArrayList<>();
        a.add(s3);
        a.add(s1);
        a.add(s2);
        Comparator<Student>cp=Comparator.comparing(Student::getName).reversed().thenComparing(Student::getAge).reversed();

        a.sort(cp);
        for(Student s:a){
            System.out.println(s.getName() + "  "+ s.getAge());
        }
    }
}
