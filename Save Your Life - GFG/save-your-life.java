//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String word,char x[],int b[], int n){
       int max_end_here=0;
int max_so_far=Integer.MIN_VALUE;
int s=0;int start=0,end=0;
        HashMap<Character,Integer> map=new HashMap<>();



        for (int i = 0; i <n ; i++) {
            map.put(x[i],b[i]);
        }

        for (int i = 0; i <word.length() ; i++) {
            if(map.containsKey(word.charAt(i))){
                max_end_here=max_end_here +map.get(word.charAt(i));
            }
            else {
                max_end_here=max_end_here +(int)word.charAt(i);
            }

            if(max_so_far<max_end_here){
                max_so_far=max_end_here;
                start=s;
                end=i;
            }
            if(max_end_here<0){
                max_end_here=0;
                s=i+1;
            }
        }

//        System.out.println(word.substring(start,end+1));

    return word.substring(start,end+1);  
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends