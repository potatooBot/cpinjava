package DSA.Trie;
class Node {
    Node links[]=new Node[26];
    int cntEnd=0;
    int cntPrefix=0;
public Node(){

}
public boolean isContains(char ch){

return (links[ch-'a']!=null);
}
    public Node get(char ch){
        return links[ch-'a'];
    }
public void incrementPrefix(){
    cntPrefix++;
}
public void incrementEnd(){
    cntEnd++;
}


public void put(char ch,Node node)
{

    links[ch-'a']=node;
}
public int getPrefix(){
    return cntPrefix;
}public int getEnd(){
    return cntEnd;
}
}
public class count_word_with_given_prefix {
public static Node root;
    public count_word_with_given_prefix(){
    root=new Node();
}
public int startsWith(String prefix){
    Node node=root;
        for (int i = 0; i <prefix.length() ; i++) {
        if(node.isContains(prefix.charAt(i))){
           node=node.get(prefix.charAt(i));
        }
        else{
            return 0;
        }
    }
        return node.getPrefix();
}
public  void insert(String word){
Node node=root;
    for (int i = 0; i <word.length() ; i++) {
        if(!node.isContains(word.charAt(i))){
            node.put(word.charAt(i),new Node());

        }
        node=node.get(word.charAt(i));
        node.incrementPrefix();
    }
    node.incrementEnd();
}
    static  public int prefixCount(String[] words, String pref) {
count_word_with_given_prefix T=new count_word_with_given_prefix();

        for (int i = 0; i <words.length ; i++) {
T.insert(words[i]);
        }

        return T.startsWith(pref);
    }
    public static void main(String[] args) {
//        String words[] = {"pay","attention","practice","attend"};String pref = "at";
        String words[] = {"leetcode","win","loops","success"};String pref = "code";
        System.out.println(prefixCount(words,pref));


    }
}
