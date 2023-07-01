//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} class GfG {
    public static Node buildTree(String str) {

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
            int sum = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            Node root = buildTree(s);
            Solution ob=new Solution();
            
            ArrayList<ArrayList<Integer>> ans= ob.printPaths(root, sum);
            
            for(int i=0;i<ans.size();i++)
            {
                for(int j=0;j<ans.get(i).size();j++)
                    System.out.print(ans.get(i).get(j)+" ");
                    
                System.out.println();
            }
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/*Tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution
{
        public static void getPathSum(Node node,int sum,ArrayList<Integer> ds,ArrayList<ArrayList<Integer>> lisofList){

        ds.add(node.data);
        sum=sum-node.data;
        if(sum==0){
            lisofList.add(new ArrayList<>(ds));
            ds.remove(ds.size()-1);
        return ;
        }
//        if(node==null) {
//            return;
//        }

        if(node.left!=null)
    getPathSum(node.left,sum,ds,lisofList);

if(node.right!=null)
            getPathSum(node.right,sum,ds,lisofList);
ds.remove(ds.size()-1);

    }
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
              ArrayList<ArrayList<Integer>> listofList=new ArrayList<>();
ArrayList<Integer> ds=new ArrayList<>();

getPathSum(root,sum,ds,listofList);
        // System.out.println(listofList);
        return listofList;
    }
}