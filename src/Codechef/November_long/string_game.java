package Codechef.November_long;
import  java.util.*;
public class string_game {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int j = 0; j <t ; j++) {

//int n=sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }

//            if(s.length()==map.size()) {
//                System.out.println("NO");
//                continue;
//            }
//            if(map.size()==1&&s.length()%2==0) {
//                System.out.println("YES");
//                continue;
//            }
//            if(map.size()==1) {
//                System.out.println("NO");
//                continue;
//            }
//
//
//
//HashSet <Integer> set=new HashSet<>();
            int coun=0;
            for (int val:map.values()) {
                System.out.println(val&1);
//                if((val&1)==1) coun++;
            }
            if(coun>0) System.out.println("NO");
            else System.out.println("YES");
//
//            if(set.size()>1) {
//                System.out.println("NO");
//            }
//            else {
//                System.out.println("YES");
//            }


        }
    }

}
