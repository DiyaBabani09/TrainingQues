package ExceptionQues;
class InvalidVotes extends RuntimeException{
    InvalidVotes(String str){
        super(str);
    }
}
public class Example9 {
    public static void main(String[] args) {
        int age = 5;
        try {
            if (age < 18) {
                throw new InvalidVotes("age must be greater then 18");
            } else {
                System.out.println(age);
            }
        } catch (InvalidVotes e) {
            System.out.println(e.getMessage());
        }
    }
}
