//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
           // add your code
        HashMap <String,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
int maxi=Integer.MIN_VALUE;
        for (Map.Entry<String,Integer> entry:
             map.entrySet()) {
            maxi=Math.max(maxi, entry.getValue());
        }
List<String> list=new ArrayList<>();;
String ans[]=new String[2];
        for (Map.Entry<String,Integer> entry:map.entrySet()
             ) {
            if(entry.getValue()==maxi){
            list.add(String.valueOf(entry.getKey()));
            }
        }
    
        Collections.sort(list);
    String str=list.get(0);

        for (Map.Entry<String,Integer> entry:
             map.entrySet()) {
            if(String.valueOf(entry.getKey())==str){
                ans[0]=entry.getKey();
                ans[1]=String.valueOf(entry.getValue());
            }
        }
        // System.out.println(ans[0]);
        // System.out.println(ans[1]);
        return ans;

        
    }
}

