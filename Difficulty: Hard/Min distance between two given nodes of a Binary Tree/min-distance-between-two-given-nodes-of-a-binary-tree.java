//{ Driver Code Starts
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Main {
    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            String[] ab = br.readLine().trim().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            GfG g = new GfG();
            System.out.println(g.findDist(root, a, b));
        }
    }
}


// } Driver Code Ends


// FUNCTION CODE
/* A Binary Tree node
  */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
     public static void inorder(Node root,ArrayList<Integer> ds){
        if(root==null) return;
        inorder(root.left,ds);
        ds.add(root.data);
        inorder(root.right,ds);
    }
    public static void buildGraph(Node root,ArrayList<ArrayList<Integer>> adjList){
        if(root==null) return ;

        buildGraph(root.left,adjList);
        if(root.left!=null){
            adjList.get(root.data).add(root.left.data);
            adjList.get(root.left.data).add(root.data);
        }
        if(root.right!=null){
            adjList.get(root.data).add(root.right.data);
adjList.get(root.right.data).add(root.data);
        }
        buildGraph(root.right,adjList);
 }

 public static int dijkstra(ArrayList<ArrayList<Integer>> adjList,int n,int src,int dest){
        int dis[]=new int[n+1];
        Arrays.fill(dis,(int)1e9);
    // System.out.println(adjList);
        dis[src]=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while (q.isEmpty()==false)
        {
            int node=q.peek();
            q.remove();
            for (int adjNode:adjList.get(node)
                 ) {
                if(dis[node]+1<dis[adjNode])
{
    dis[adjNode]=1+dis[node];
    q.add(adjNode);
}
            }
        }
     //System.out.println(Arrays.toString(dis));
  return dis[dest];


    }

    static  int findDist(Node root, int a, int b) {
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        inorder(root,ds);
Collections.sort(ds);
int maxi=ds.get(ds.size()-1);

        for (int i = 0; i <=maxi; i++) {
            adjList.add(new ArrayList<>());
        }


        buildGraph(root,adjList);
        int dist=dijkstra(adjList,maxi,a,b);
        return dist;
    }
}