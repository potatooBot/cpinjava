//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine().trim());

        while (t-- > 0) {
            String line = scanner.nextLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxIndexDiff(nums));
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to find the maximum index difference.
    int maxIndexDiff(int[] nums) {
         int arr[][]=new int[nums.length][2];

        for(int i=0;i<nums.length;i++){
            arr[i][0]=i;
            arr[i][1]=nums[i];
        }

        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));

      //  for(int rows[]:arr)
//System.out.println(Arrays.toString(rows));

        int ans=0;
        int mini=arr[0][0];
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,arr[i][0]-mini);
            mini=Math.min(mini,arr[i][0]);
           // System.out.println(mini);
        }
        return ans;
    }
}