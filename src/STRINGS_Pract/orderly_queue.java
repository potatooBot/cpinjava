//You are given a string s and an integer k. You can choose one of the first k letters of s and append it at the end of the string..
//
//        Return the lexicographically smallest string you could have after applying the mentioned step any number of moves.
//
//
//
//        Example 1:
//
//        Input: s = "cba", k = 1
//        Output: "acb"
//        Explanation:
//        In the first move, we move the 1st character 'c' to the end, obtaining the string "bac".
//        In the second move, we move the 1st character 'b' to the end, obtaining the final result "acb".
//        Example 2:
//
//        Input: s = "baaca", k = 3
//        Output: "aaabc"
//        Explanation:
//        In the first move, we move the 1st character 'b' to the end, obtaining the string "aacab".
//        In the second move, we move the 3rd character 'c' to the end, obtaining the final result "aaabc".
package STRINGS_Pract;

import java.util.Arrays;

public class orderly_queue {
    public static String orderlyQueue(String s, int k) {
if(k>1){
    char ch[]=s.toCharArray();
    Arrays.sort(ch);
    return new String(ch);
}
        String ss = s;
        for (int i = 1; i < s.length(); i++) {
            String rot = s.substring(i) + s.substring(0, i);
            if (ss.compareTo(rot) > 0)
                System.out.println(rot);
                ss = rot;
        }
        return ss;
    }
    public static void main(String[] args) {
        String s = "dbc";
        int k=1;
//        System.out.println(  s = s.substring(1) + s.substring(0,1));
        String res=orderlyQueue(s,k);
//        System.out.println(res);
    }
}
