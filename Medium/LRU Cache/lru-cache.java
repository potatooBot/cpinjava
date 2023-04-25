//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

  public class LRUDesign {

    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            int capacity = Integer.parseInt(read.readLine());
            int queries = Integer.parseInt(read.readLine());
            LRUCache cache = new LRUCache(capacity);
            String str[] = read.readLine().trim().split(" ");
            int len = str.length;
            int itr = 0;

            for (int i = 0; (i < queries) && (itr < len); i++) {
                String queryType = str[itr++];
                if (queryType.equals("SET")) {
                    int key = Integer.parseInt(str[itr++]);
                    int value = Integer.parseInt(str[itr++]);
                    cache.set(key, value);
                }
                if (queryType.equals("GET")) {
                    int key = Integer.parseInt(str[itr++]);
                    System.out.print(cache.get(key) + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// design the class in the most optimal way
class Node{
    Node prev,next;
    int key,val;
    Node(int key,int val ){
        this.key=key;
        this.val=val;
    }
}
class LRUCache
{
     Node head=new Node(0,0);
 Node tail=new Node(0,0);
 int cap=0;
 HashMap<Integer,Node> map=new HashMap<>();
    //Constructor for initializing the cache capacity with the given value.
    LRUCache(int capacity)
    {
        cap=capacity;
        head.next=tail;
        tail.prev=head;
    }

    //Function to return value corresponding to the key.
    public  int get(int key)
    {
          if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        else {
            return -1;
        }
    }

    //Function for storing key-value pair.
    public  void set(int key, int value)
    {
          if(map.containsKey(key)){
           Node node=map.get(key);
            remove(node);
        }
        if(cap==map.size()){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
        public void remove(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void insert(Node node){
        map.put(node.key,node);
        Node headNext=head.next;
        head.next=node;
        node.prev=head;
        node.next=headNext;
        headNext.prev=node;
    }
}
