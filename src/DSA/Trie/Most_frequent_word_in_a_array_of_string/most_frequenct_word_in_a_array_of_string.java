package DSA.Trie.Most_frequent_word_in_a_array_of_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

class Node {
    Node links[]=new Node[26];
 int cntEndWith=0;
    int cntprefix=0;
    Node(){

    }

    boolean containsKey(char ch){
        return (links[ch-'a']!=null);
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    void put(char ch,Node node){
        links[ch-'a']=node;
    }
    void increamentPrefix(){
        cntprefix++;
    }
       void increamentEndWith(){
        cntEndWith++;
    }
    int getEndsWith(){
        return cntEndWith;
    }
    int getPredixCount(){
        return cntprefix;
    }

}
public class most_frequenct_word_in_a_array_of_string {

    private static Node root;
    most_frequenct_word_in_a_array_of_string(){
        root=new Node();
    }
    public void insert(String word){

        Node node=root;
        for (int i = 0; i <word.length() ; i++) {
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            node=node.get(word.charAt(i));
            node.increamentPrefix();
        }
        node.increamentEndWith();
    }
    public int countEndsWith(String word){
        Node node=root;
        for (int i = 0; i <word.length() ; i++) {
            if(node.containsKey(word.charAt(i))){
                node=node.get(word.charAt(i));
            }
            else {
                return 0;
            }

        }
        return node.getEndsWith();
    }

    public int worStartWith(String word){
        Node node=root;
        for (int i = 0; i <word.length() ; i++) {
            if(node.containsKey(word.charAt(i))==true){
                node=node.get(word.charAt(i));
            }
            else {
                return 0;
            }

        }
        return node.getPredixCount() ;
    }
    static    public String mostFrequentWord(String arr[],int n)
    {
        most_frequenct_word_in_a_array_of_string T=new most_frequenct_word_in_a_array_of_string();
        Node node=root;
        for (int i = 0; i < arr.length ; i++) {
            T.insert(arr[i]);
        }
        HashMap<String,Integer> map=new HashMap<>();
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            int val= T.countEndsWith(arr[i]);
            map.put(arr[i],val);
//            System.out.println(T.countEndsWith(arr[i]));
        maxi=Math.max(maxi,val);
        }
        String ans="";

        Set<String> set=new TreeSet<String>();

        for (Map.Entry<String,Integer> entry:
                map.entrySet()) {
            if(maxi==(int) entry.getValue()){
                set.add(entry.getKey());
            }
        }
        int count=set.size();

        for(int i=0;i<arr.length;i++){
            for(String str:set){
                if(arr[i]==str&&count>1){
                    set.remove(arr[i]);
                    count--;
                    break;


                }
                if(count==1){
                    break;
                }
            }
        }
        for(String str:set){
            ans=str;
        }
        return ans;      // code here
    }
    public static void main(String[] args) {
        int N = 3;
        String arr[] = {"geeks","for","geeks"};
   String str=     mostFrequentWord(arr,N);
        System.out.println(str);
    }
}
