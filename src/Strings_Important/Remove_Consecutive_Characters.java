package Strings_Important;
import java.util.*;
public class Remove_Consecutive_Characters {
    public static void main(String[] args) {
        String str = "aabaa";
        List <Character> lst=new ArrayList<>();
int i=0;
int j=0;
      while(i!=str.length()-1){

            if(str.charAt(i)==str.charAt(i+1)){
                lst.add(str.charAt(i));
                i++;
            }
//            else if(str.charAt(i)!=str.charAt(i+1)) {
//                lst.add(str.charAt(i+1));
//             i++;
//            }
          else if(str.charAt(i)!=str.charAt(i+1)&&lst.get(i-1)!=str.charAt(i+1)) {
            lst.add(str.charAt(i+1));
              i++;
            }

        }
        System.out.println(lst);
//        String or;
//        for(int i=0;i<str.length()-1;i++){
//            or=
//
//        }

    }
}
