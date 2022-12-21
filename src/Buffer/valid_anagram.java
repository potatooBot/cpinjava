package Buffer;

import java.util.*;
public class valid_anagram {
    public static void main(String[] args) {
         String str = "a";
        String t = "ab";


        List <Character> stk1=new ArrayList<>();
        List <Character> stk2=new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            stk1.add(str.charAt(i));

        }


        for (int i = 0; i <t.length() ; i++) {
            stk2.add(t.charAt(i));
        }

        Collections.sort(stk1);
        Collections.sort(stk2);

        System.out.println(stk1);
        System.out.println(stk2);
       if(stk1.equals(stk2)){
           System.out.println(true);
       }
       else {
           System.out.println(false);
       }

    }
}
