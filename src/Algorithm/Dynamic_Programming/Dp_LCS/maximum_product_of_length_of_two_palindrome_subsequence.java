package Algorithm.Dynamic_Programming.Dp_LCS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maximum_product_of_length_of_two_palindrome_subsequence {
    public static boolean isPalim(List<Character> ds) {
        int i = 0;
        int j = ds.size() - 1;
        while (i < j) {
            if (ds.get(i) != ds.get(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void getSubse(String str, List<Integer> ans, List<Character> ds, int idx) {
        if (idx == str.length()) {
            return;
        }
        ds.add(str.charAt(idx));
        if (isPalim(ds) == true&&ds.size()<str.length()) {
            ans.add(ds.size());
        }
        getSubse(str, ans, ds, idx + 1);
        ds.remove(ds.size() - 1);
        getSubse(str, ans, ds, idx + 1);
    }


    public static int maxProduct(String s) {


        List<Integer> ans = new ArrayList<>();
        List<Character> ds = new ArrayList<>();
        getSubse(s, ans, ds, 0);
     Collections.sort(ans,Collections.reverseOrder());
        System.out.println(ans);
        System.out.println(ans.get(0)*ans.get(1));
        return 0;
    }





    public static void main(String args[]) {

     //  String s1= "accbcaxxcxx";
      String s1= "bbb";


        int ans=maxProduct(s1);

    }
}
