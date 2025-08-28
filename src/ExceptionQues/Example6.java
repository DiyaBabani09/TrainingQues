package ExceptionQues;



import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example6  {
    public static void  method1() throws FileNotFoundException{
        FileReader f=new FileReader("a.txt");
    }
    public static void main(String[] args) {
        try{
            method1();
        }catch(FileNotFoundException e){
            System.out.println("it may generate erroe");
        }
        System.out.println("all other code run");
    }

}