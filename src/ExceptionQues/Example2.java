package ExceptionQues;

public class Example2{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println("hi inner try");

            try {
                int c = a / b;
                System.out.println(c);


            } catch (Exception e) {
                System.out.println("error");
            }
        }

        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println( e);
        }

    }
}
