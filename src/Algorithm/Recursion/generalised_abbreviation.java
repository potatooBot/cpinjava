package Algorithm.Recursion;

import java.util.ArrayList;
import java.util.*;
public class generalised_abbreviation {
    public static void getAllAbbre(StringBuilder sb,String word,List<String> ans,int i,int k){
       int len=sb.length();
        if(i==word.length()){
            if(k!=0) {
                sb.append(k);
            }
            ans.add(sb.toString());
        }
        else {
            getAllAbbre(sb,word,ans,i+1,k+1);
            if(k!=0) {
                sb.append(k);
            }
            sb.append(word.charAt(i));
            getAllAbbre(sb,word,ans,i+1,0);
        }
        sb.setLength(len);
     }
    public static List<String > generalisedAbbr(String word){
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        getAllAbbre(sb,word,ans,0,0);

        return ans;


    }
    public static void main(String[] args) {
        String word="word";
        System.out.println(generalisedAbbr(word));
    }
}
