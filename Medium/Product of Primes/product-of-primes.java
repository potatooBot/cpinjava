//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            long L = Long.parseLong(a[0]);
            long R = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.primeProduct(L, R));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
       public static void simpleSieve(boolean prime[]){

        Arrays.fill(prime,true);
prime[1]=false;
        for (int p = 2; p*p <=1000000 ; p++) {
            if(prime[p]==true) {
                for (int i = p * p; i <=1000000; i = i + p) {
                    prime[i] = false;
                }
            }
        }
    }
    public static ArrayList<Integer> getPrime(int n,boolean prime[]){
        ArrayList<Integer> ds=new ArrayList<>();
        for (int i = 2; i <=n ; i++) {
            if(prime[i]==true) {
                ds.add(i);
            }
        }
        return ds;
    }
    public static long segmentedSieve(int left,int right,ArrayList<Integer> primeValues){
        int dummy[]=new int[right-left +1];

        Arrays.fill(dummy,1);


        for ( int ele :primeValues) {


            int firstMultiple =(left/ele)*ele;

            if(firstMultiple<left){
                firstMultiple=firstMultiple+ele;
            }

            for (int i = Math.max(firstMultiple,ele*ele); i <=right ; i=i+ele) {
dummy[i-left]=0;
            }
        }
long ans=1;
  int mod=1000000007;
        for (int i = left; i <=right ; i++) {
            if(dummy[i-left]==1){
                if(i==1) continue;
           ans=(ans*i)%mod; 
            }
        }
return ans;
    }
    static long primeProduct(long L, long R){
    int left=(int)L;
    int right=(int)R;
      boolean prime[]=new boolean[1000001];
    simpleSieve(prime);
    ArrayList<Integer> ds=getPrime((int)Math.sqrt(right),prime);
    long ans=segmentedSieve(left,right,ds);
    return ans;
    
    
    }
}