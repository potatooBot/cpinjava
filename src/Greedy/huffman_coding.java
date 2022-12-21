package Greedy;
import java.util.*;
class Node implements Comparable<Node>{
    int freq;
    Node left;
    Node right;

    Node(int freq){
        this.freq=freq;
        this.left=null;
        this.right=null;
    }

    public int compareTo(Node other){
        if(this.freq == other.freq){
            return 1;
        }
        return this.freq - other.freq;
    }
}
public class huffman_coding {

    public static ArrayList<String> huffmanCodes(String S, int f[], int N)
{

    ArrayList<String> arr=new ArrayList<>();
    PriorityQueue<Node> pq=new PriorityQueue<>();

    for(int i=0;i<N;i++){
        Node temp=new Node(f[i]);
        pq.add(temp);
    }

    while(pq.size()>1){
        Node top=pq.poll();
        Node secondTop=pq.poll();

        int sumFreq=top.freq+secondTop.freq;
        Node parent=new Node(sumFreq);
        parent.left=top;
        parent.right=secondTop;

        pq.add(parent);
    }



    Node root=pq.peek();

    traverse(root,"",arr);
    return arr;

}

    static void traverse(Node root, String answer,ArrayList<String> arr){
        if(root.left==null && root.right==null){//Check for leaf nodes
            arr.add(answer);
            return;
        }

        traverse(root.left,answer+"0",arr);
        traverse(root.right,answer+"1",arr);
    }


    public static void main(String[] args) {
String s="abcdef";
int freq[] = {5, 9, 12, 13, 16, 45};


        ArrayList<String> str=new ArrayList<String>();
        str=huffmanCodes(s,freq,s.length());
        System.out.println(str);


    }
}
