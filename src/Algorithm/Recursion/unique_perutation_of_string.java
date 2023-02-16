package Algorithm.Recursion;

import java.util.*;

public class unique_perutation_of_string {
    public static void swap(int i,int l,char[] s){
char temp=s[i];
s[i]=s[l];
s[l]=temp;
    }
    public static void getPerm(char[] s,HashSet<String> set,int idx){
        String dummy="";
        if(idx==s.length){
     ArrayList<Character> list=new ArrayList<>();

            for (int i = 0; i <s.length ; i++) {
               list.add(s[i]);
            }

              for (int i = 0; i < list.size(); i++) {
                  dummy =  dummy +list.get(i) ;
              }

            set.add(dummy);
              return;
        }

        for (int i = idx; i <s.length ; i++) {
            swap(i,idx,s);
            getPerm(s,set,idx+1);
            swap(i,idx,s);
        }
    }
    public static List<String> find_permutation(String S) {
        HashSet<String> set=new HashSet<>();
        char ch[]=S.toCharArray();

        getPerm(ch,set,0);

        ArrayList <String> ans=new ArrayList<>();
      for(String st:set){
          ans.add(st);

      }
        Collections.sort(ans,String.CASE_INSENSITIVE_ORDER);

        return ans;
        // Code here
    }
    public static void main(String[] args) {
        String s="ABSG";
        List<String> ans=find_permutation(s);
        System.out.println(ans);
    }
}
