package Lambda;

import java.util.ArrayList;

public class Student  implements Comparable<Student>{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
         return  this.age-s.age;
    }

    @Override
    public String toString() {
        return "name  " + name + "  age  " + age;
    }

    public static void main(String[] args) {
        Student s3=new Student("diya",21);
        Student s1=new Student("Moni",71);
        Student s2=new Student("priya",20);
        ArrayList<Student>a=new ArrayList<>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.sort(null);
        System.out.println(a);

    }
}
