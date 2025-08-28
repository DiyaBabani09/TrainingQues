package ExceptionQues;

public class Example3{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {

            int nums[]={1,2,3};
            int c = a / b;
            System.out.println(nums[8]);

            System.out.println(c);

        }
        catch ( ArithmeticException e) {
            System.out.println(e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println( e);
        }

    }
}
// it will show which catch first throws exception
