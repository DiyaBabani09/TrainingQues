package ExceptionQues;

import java.lang.Exception;
class MyException extends Exception{
    MyException(String str){
        super(str);
    }
}
public class Example8{
    public static void main(String[] args) {

        try{

            throw  new MyException("custom Exception");
        }catch(MyException e ){

            System.out.println("defalut output ");
            System.out.println(e);
        }

    }
}