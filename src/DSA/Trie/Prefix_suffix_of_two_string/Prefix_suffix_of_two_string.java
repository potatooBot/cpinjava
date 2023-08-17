package DSA.Trie.Prefix_suffix_of_two_string;
class Node{
    boolean flag=false;
    Node links[]=new Node[26];
    Node(){

    }
    void put(char ch,Node node){
        links[ch-'a']=node;
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    void setEnd(){
        flag=true;
    }
    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }
    boolean getEnd(){
        return flag;
    }
}
public class Prefix_suffix_of_two_string {
static Node root;
    Prefix_suffix_of_two_string (){
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
    public static boolean ifPrefixExist(String word){
        Node node=root;
        for (int i = 0; i <word.length() ; i++) {
            if(node.containsKey(word.charAt(i))==false){
                return false;
            }
            node=node.get(word.charAt(i));
        }
        return true;
    }
    static  public int prefixSuffixString(String s1[],String s2[])
    {
        Prefix_suffix_of_two_string T=new Prefix_suffix_of_two_string();
        for (int i = 0; i <s1.length ; i++) {
            insert(s1[i]);
        }

        for (int i = 0; i <s1.length ; i++) {
            StringBuilder sb=new StringBuilder(s1[i]).reverse();
            String str=sb.toString();
         insert(str);
        }
int count=0;
        for (int i = 0; i <s2.length ; i++) {
            StringBuilder sb=new StringBuilder(s2[i]).reverse();
            String str=sb.toString();
            if(ifPrefixExist(s2[i])||ifPrefixExist(str)){
                count++;
            }
        }


        return count;
    }
    public static void main(String[] args) {
        String [] s1 = {"jrjiml", "tchetn", "ucrhye", "ynayhy",
                "cuhffd", "cvgpoiu", "znyadv"};
      String []  s2 = {"jr", "ml", "cvgpoi", "gpoiu", "wnmkmluc",
                "geheqe", "uglxagyl", "uyxdroj"};
        int ans=prefixSuffixString(s1,s2);
        System.out.println(ans);

    }
}
