//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
  
     static int isHappy(int n) { 
         HashSet <Integer> set=new HashSet<>();

        int num=n;
        while(num!=1){
int val=num;
ArrayList<Integer> ds=new ArrayList<>();
int sum=0;
while(val!=0){
ds.add(val%10);
val=val/10;
}

for(int i=0;i<ds.size();i++){
sum=sum+(int)Math.pow(ds.get(i),2);
}
        if((sum==1)) return 1;
if(set.contains(sum)) return 0;
num=sum;
set.add(sum);
        }
return 1;
     }
}