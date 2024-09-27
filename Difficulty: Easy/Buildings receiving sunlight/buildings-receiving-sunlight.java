//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    public static int longest(int nums1[]) {
        // write code here
        int n=nums1.length;
    long ans[]=new long[n];
Stack<Long> stk=new Stack<>();
        for (int i = 0; i<n ; i++) {
while (stk.isEmpty()==false&&stk.peek()<=nums1[i]){
    stk.pop();

}

if(stk.isEmpty()==false&&stk.peek()>nums1[i])
{
    ans[i]=stk.peek();
}
else {
    ans[i]=-1;
}
stk.push((long)nums1[i]);
        }
      //  System.out.println(Arrays.toString(ans));
int cnt=0;

for(long ele:ans)
if(ele==-1) cnt++;
return cnt;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            // int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.longest(arr);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends