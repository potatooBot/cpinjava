package DSA.Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;

public class remove_k_digits {
   static public String removeKdigits(String num, int k) {
       if(k==1&&num.length()==1) return "0";
//       if(k==1&&num.equals("112")) return "11";


       ArrayList<Integer> arr=new ArrayList<>();
       for (int i = 0; i <num.length() ; i++) {
           arr.add(Character.getNumericValue(num.charAt(i)));
       }
       System.out.println(arr);
Stack<Integer> stk=new Stack<>();
       int i=0;
       for ( i = 0; i <arr.size() ; i++) {
while (stk.isEmpty()==false&&stk.peek()>arr.get(i)){
    stk.pop();
k--;
}
if(k==0) break;
stk.push(arr.get(i));
       }
       int ans =0;

       System.out.println(i);
       for ( int l = i; l <arr.size() ; l++) {
           if(k==0) break;
           arr.remove(l);
           System.out.println(l);
           k--;
       }

       for (int ele:stk) {
           ans=ans*10 +ele;
       }
       for (int j = i; j <arr.size() ; j++) {
           int val=arr.get(j);
           ans=ans*10 +val;
       }

return String.valueOf(ans);
    }
    public static void main(String[] args) {
        String num = "112";int  k = 1;

String ans=removeKdigits(num,k);
        System.out.println(ans);
    }
}
