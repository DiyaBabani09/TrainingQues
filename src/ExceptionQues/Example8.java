package ExceptionQues;

import java.lang.Exception;
class MyException extends Exception{
    MyException(String str){
        super(str);
    }
}
public class Example8{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int c=a/b;
            throw  new MyException("custom Exception");
        }catch(MyException e ){
            int c=a/1;
            System.out.println("defalut output ");
            System.out.println(c);
        }

    }
}