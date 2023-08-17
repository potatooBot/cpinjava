package DSA.Trie.Camel_Case_Pattern_Matching;
import java.util.*;
class Node{
    boolean flag=false;
   Node links[]=new Node[123];
    Node(){

    }
    void put(char ch, Node node) {
        if (ch >= 65 && ch <= 90) {
            links[ch] = node;
        } else {
            links[ch] = node;
        }
    }
   Node get(char ch){
       if(ch>=65&&ch<=90){
           return links[ch];
       }
       else
        return links[ch];
    }
    void setEnd(){
        flag=true;
    }
    boolean containsKey(char ch) {
        if (ch >= 65 && ch <= 90) {
            return links[ch ] != null;
        } else {
            return links[ch ] != null;
        }
    }
    boolean getEnd(){
        return flag;
    }
}
public class camel_case_pattern_matching {
    static Node root;
   camel_case_pattern_matching (){
        root=new Node();
    }

    public static void insert(String word){
        Node node=root;
        for (int i = 0; i <word.length() ; i++) {
            if (!node.containsKey(word.charAt(i))) {
                node.put(word.charAt(i),new Node());
            }
            node=node.get(word.charAt(i));

            node.setEnd();
        }
    }
    public static boolean ifPrefixExist(String word,String pattern){
        Node node=root;
        int count=0;
        for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i)>=97&&word.charAt(i)<=122){

                if (node.containsKey(word.charAt(i))){
count++;
                    node=node.get(word.charAt(i));
               continue;
                }
continue;
            }
            if(node.containsKey(word.charAt(i))==false){
                return false;
            }
count++;

            node=node.get(word.charAt(i));
        }
        if(count==pattern.length()) return true;
        return false;

    }
  static   ArrayList<String> CamelCase(int N,String[] dictionary,String pattern){
        //code here
        ArrayList<String> ans=new ArrayList<>();
        camel_case_pattern_matching T=new camel_case_pattern_matching();

        insert(pattern);

        for (int i = 0; i <dictionary.length ; i++) {
            if(ifPrefixExist(dictionary[i],pattern)){
ans.add(dictionary[i]);
            }
        }
        Collections.sort(ans);
        System.out.println(ans);
        if(ans.isEmpty()){
            ans.add("-1");
        }
        return ans;
    }
    public static void main(String[] args) {
        int N=3;
//        String Dictionary[]={"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
//String        Pattern="FoBa";
String Dictionary[]={"CompetitiveProgramming","CounterPick","ControlPanel"};
String        Pattern="CP";
       ArrayList<String> ans=CamelCase(N,Dictionary,Pattern);

    }
}

