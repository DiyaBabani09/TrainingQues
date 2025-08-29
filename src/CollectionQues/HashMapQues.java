package CollectionQues;

import java.util.HashMap;


public class HashMapQues {
    public static boolean isomorphic(String str,String str2) {
        HashMap<Character, Character> m = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char org = str.charAt(i);
            char rep = str2.charAt(i);
            if (!m.containsKey(org)) {
                if (!m.containsValue(rep)) {
                    m.put(org, rep);
                } else {
                    return false;
                }
            } else {
                char value = m.get(org);
                if (value != rep) {
                    return false;
                }
            }
        }
                return true;
            }


    public static void main(String[] args) {
        String str="aabcd";
        String str2="xxyle";
        System.out.println(isomorphic(str,str2));

       ;
        }
    }

