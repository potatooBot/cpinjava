//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
class Solution {
    public static int kthLargest(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++)
        {
        int sum=0;
        
        for(int j=i;j<arr.length;j++){
    sum=sum+arr[j];
    pq.add(sum);
    if(pq.size()>k){
        pq.poll();
    }
    
        }
        }
int ans=0;
//System.out.println(pq);
for(int ele:pq) 
return ele;

return ans;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }
            int k = Integer.parseInt(br.readLine());

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.kthLargest(arr, k);

            System.out.println(res);

            // System.out.println("~");
        }
    }
}

// } Driver Code Ends