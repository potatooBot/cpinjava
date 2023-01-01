package Algorithm.Recursion;
import java.util.*;

import static java.util.Arrays.stream;

public class longest_substring_partition {
    public static void palindromeHelper(int idx,String s,List<List<String>> ans,List<String> ds){
        if(idx==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = idx; i <s.length() ; ++i) {
            if(isPalindrome(s,idx,i)==true){
                ds.add(s.substring(idx,i+1));
                palindromeHelper(i+1,s,ans,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    public static String longestPalindrome(String s) {
        List <List<String>> ans=new ArrayList<>();
        List <Integer> fin=new ArrayList<>();
        List <String> ds=new ArrayList<>();
        palindromeHelper(0,s,ans,ds);

                for (List ele:ans){
                    for (int i = 0; i <ele.size() ; i++) {
                        ds.add((String) ele.get(i));
                    fin.add(((String) ele.get(i)).length());
                    }
        }
        System.out.println(ds);
        return ds.get(fin.indexOf(Collections.max(fin)));

    }
    public static boolean isPalindrome(String s,int start,int end){
        while (start<=end){
            if(s.charAt(start++)!=s.charAt(end--))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        String ans=longestPalindrome(str);
        System.out.println(ans);

    }
}
