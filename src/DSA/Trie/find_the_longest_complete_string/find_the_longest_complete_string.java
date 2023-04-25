package DSA.Trie.find_the_longest_complete_string;
class Node {
   Node links[]=new Node[26];
boolean flag=false;
    Node(){

    }

    boolean containsKey(char ch){
        return (links[ch-'a']!=null);
    }
   Node get(char ch){
        return links[ch-'a'];
    }
    void put(char ch, Node node){
        links[ch-'a']=node;
    }
   void setFlag(){
        flag=true;
   }
   boolean getFlag(){
        return flag;
   }

}
public class find_the_longest_complete_string {
    private  Node root;
    find_the_longest_complete_string(){
        root=new Node();
    }
    public void insert(String word){
        Node node=root;
        for (int i = 0; i <word.length() ; i++) {
            if(node.containsKey(word.charAt(i))==false){
                node.put(word.charAt(i),new Node());
            }
            node=node.get(word.charAt(i));
        }
        node.setFlag();
    }
    public boolean countIfPrefixExist(String word){
        Node node=root;
        boolean flag=true;
        for (int i = 0; i <word.length() ; i++) {
            if(node.containsKey(word.charAt(i))){

                node=node.get(word.charAt(i));
                flag=flag&node.getFlag();
            }
            else {
                return false;
            }
        }
        return flag;
    }

    public static String longestString(int n, String[] arr) {
find_the_longest_complete_string T=new find_the_longest_complete_string();
        for (int i = 0; i < arr.length ; i++) {
            T.insert(arr[i]);
        }
String longest="";
        for (int i = 0; i < arr.length ; i++) {
            if(T.countIfPrefixExist(arr[i])==true){
                if (arr[i].length()>longest.length()){
                    longest=arr[i];
                }
                else if (arr[i].length()==longest.length()){
                    if(arr[i].compareTo(longest)<0){
                        longest=arr[i];
                    }

                }
            }
        }

    return longest;
    }
    public static void main(String[] args) {
        String str[]={"ab", "a", "aa", "abd","abc", "abda", "abdd", "abde", "abdab"};

String ans=longestString(str.length,str);

        System.out.println(ans);}
}
