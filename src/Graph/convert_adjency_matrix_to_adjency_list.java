package Graph;// Java program to convert adjacency
// matrix representation to
// adjacency list
import java.util.*;

public class convert_adjency_matrix_to_adjency_list{

    // Function to convert adjacency
    // list to adjacency matrix

    public static boolean checkforBipartite(int node,int col,int colours[],ArrayList<ArrayList<Integer>> adj){
        colours[node]=col;

        for(Integer it:adj.get(node)){
            if(colours[it]==-1){
                if(checkforBipartite(it,1-col,colours,adj)==false) return false;
            }
            else if(colours[it]==col) return false;
        }

        return true;
    }

    public  static boolean isBipartite(int[][] a) {
        int l = a[0].length;
        ArrayList<ArrayList<Integer>> adj
                = new ArrayList<ArrayList<Integer>>(l);

        // Create a new list for each
        // vertex such that adjacent
        // nodes can be stored
        for (int i = 0; i < l; i++) {
            adj.add(new ArrayList<Integer>());
        }

        int i, j;
        for (i = 0; i < a[0].length; i++) {
            for (j = 0; j <a.length; j++) {
                if (a[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }
        int colours[]=new int[l];
        Arrays.fill(colours,-1);

        for(i=0;i<l;i++){

            if(colours[i]==-1){
                if(checkforBipartite(i,0,colours,adj)==false) return false;
            }
        }
        return true;




    }
    // Function to print the adjacency list
    static void printArrayList(ArrayList<ArrayList<Integer>>
                                       adjListArray)
    {
        // Print the adjacency list
        for (int v = 0; v < adjListArray.size(); v++) {
            System.out.print(v);
            for (Integer u : adjListArray.get(v)) {
                System.out.print(" -> " + u);
            }
            System.out.println();
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        // Given Adjacency Matrix
        int[][] a = { { 0, 0, 1 },
                { 0, 0, 1 },
                { 1, 1, 0 } };

        // function to convert adjacency
        // list to adjacency matrix

        System.out.println("Adjacency List: ");

  boolean check=isBipartite(a);
        System.out.println(check);
    }
}
