package Lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class StringLengthComparotor {
//    @Override
  public int compare(String s,String s2){
return s2.length()-s.length();
    }

    public static void main(String[] args) {
        ArrayList<String>a=new ArrayList<>();
        a.add("Diya");
        a.add("pia");
        a.add("Monika");
        a.sort((s,s1)->s.length()-s1.length());
        System.out.println(a);
    }

    }

