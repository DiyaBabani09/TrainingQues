package ExceptionQues;


public class Example7 {
    public  static  void printarray() throws ArrayIndexOutOfBoundsException{
        int nums[]={1,2,3,4,5,6};
        for(int i=0;i<=nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        try {
            printarray();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("hi");
    }
}