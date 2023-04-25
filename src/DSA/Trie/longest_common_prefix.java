package DSA.Trie;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Trie{
    Trie links[]=new Trie[26];
    boolean flg=false;
    public  Trie(){

    }
    public boolean isContaisn(char ch){
        return links[ch-'a']!=null;
    }
    public Trie get(char ch){
        return links[ch-'a'];
    }
    public void put(char ch,Trie node){
        links[ch-'a']=node;
    }

    public void setEnd() {
        flg =true ;
    }
}
public class longest_common_prefix {
    public static Trie root;
    public longest_common_prefix()
    {
        root=new Trie();
    }
    public void insert(String word){
        Trie node=root;
        for (int j = 0; j <word.length() ; j++) {
            char ch=word.charAt(j);
            if(!node.isContaisn(ch)){
                node.put(ch,new Trie());
            }
            node=node.get(ch);
        }
        node.setEnd();
    }
    public int startsWith(String pref){
        Trie node=root;

            String val="";
 int count=0;
            for (int j = 0; j <pref.length() ; j++) {
                char ch = pref.charAt(j);

                if (node.isContaisn(ch)) {
 count++;
                } else {
                  return count;
                }
            }
        return count;
    }
    static     public String longestCommonPrefix(String[] strs) {

longest_common_prefix T=new longest_common_prefix();
Trie node=root;
        for (int i = 0; i <strs.length ; i++) {
            T.insert(strs[i]);
        }
        int val=0;
        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i <strs.length ; i++) {
val=            T.startsWith(strs[i]);
            System.out.println(val);


        map.put(strs[i].substring(0,val), map.getOrDefault(val,0)+1);

        }
        System.out.println(map);
        if (map.size()>1) return "";
    if(val==0) return "";
    if(val==1) return (String.valueOf( strs[0].charAt(0)));
return strs[0].substring(0,val+1);
    }
    public static void main(String[] args) {
        String str[]={"flower","flow","flight"};
//        String str[]={"","b"};
//        String str[]={"a"};
    String ans=longestCommonPrefix(str);
        System.out.println(ans);
    }
}
