package CollectionQues;

import java.util.ArrayList;
import java.util.Scanner;

public class ListInput {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        boolean done= false;
        while(sc.hasNextInt()){
            int input= sc.nextInt();
            al.add(input);
        }
//        if (sc.hasNextLine()) {
//            sc.nextLine();
//        }
for(int i:al){
    System.out.print(i);
}
sc.close();
    }

}
