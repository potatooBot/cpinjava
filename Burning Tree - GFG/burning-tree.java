//{ Driver Code Starts
//Initial Template for Java


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

class GfG {

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
			if (i >= ip.length)
				break;

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

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s = br.readLine();
			int target = Integer.parseInt(br.readLine());
			Node root = buildTree(s);

			Solution g = new Solution();
			System.out.println(g.minTime(root, target));
			t--;

		}
	}
}



// } Driver Code Ends


//User function Template for Java
  class pair{
   int node;
    int time;
    pair(int node,int time){
        this.node=node;
        this.time=time;
    }
  }
class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
         public static void searchNode(Node root,int start,int val[],Node source[]){
        if (root == null) {
            return;
        }
        searchNode(root.left,start,val,source);
      val[0]=Math.max(val[0],root.data );
      if(root.data==start){
          source[0]=root;
      }
        searchNode(root.right,start,val,source);
    }
    public static void convertToGraph(ArrayList<ArrayList<Integer>> adjList,Node root){
        if (root == null) {
            return;
        }
        convertToGraph(adjList,root.left);
        if(root.left!=null) {
            adjList.get(root.data).add(root.left.data);
            adjList.get(root.left.data).add(root.data);
        }
        if(root.right!=null){
            adjList.get(root.data).add(root.right.data);
            adjList.get(root.right.data).add(root.data);
        }
        convertToGraph(adjList,root.right);

    }
    public static int minTime(Node root, int start) 
    {
        Queue<pair> q = new LinkedList<>();
    int val[]=new int[1];
   Node source[]=new Node[1]  ;
    searchNode(root,start,val,source);
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for (int i = 1; i <=val[0]+1 ; i++) {
            adjList.add(new ArrayList<>());
        }
convertToGraph(adjList,root);
        int maxTime=Integer.MIN_VALUE;
        boolean vis[]=new  boolean[val[0]+1];
        q.add(new pair(start,0));
       vis[start]=true;
        while (!q.isEmpty()){
            pair it=q.peek();
            q.remove();
           maxTime=Math.max(maxTime,it.time);
            for (int adjNode:
                 adjList.get(it.node)) {
                if (vis[adjNode] == false) {
                    q.add(new pair(adjNode, it.time + 1));
            vis[adjNode]=true;
                }
            }

        }
        return maxTime;
    }
}