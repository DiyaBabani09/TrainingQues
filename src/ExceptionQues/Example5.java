package ExceptionQues;
class Test{
    static void printoutput(){
        throw new NullPointerException("null");
    }
}
public class Example5 {
    public static void main(String[] args) {
//        Test t = new Test();

        try {
            Test.printoutput();

        } catch (Exception e) {
            System.out.println(e);
        } finally{
            System.out.println("always execute");
        }
    }
}