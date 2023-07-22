//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class pair{
    int data;
    int steps;
    pair(int data,int steps){
        this.data=data;
        this.steps=steps;
    }
}
class Solution{
    int solve(int num1,int num2){
        boolean prime[]=new boolean[100000];
        Arrays.fill(prime,true);
     for (int p = 2; p*p <100000 ; p++) {
         if (prime[p] == true) {
             for (int i = p * p; i < 10000; i = i + p) {
prime[i]=false;
             }
         }
     }
//        for (int i = 0; i < prime.length ; i++) {
//            System.out.println(prime[i]);
//        }
        Queue<pair> q=new LinkedList<>();
     q.add(new pair(num1,0));
     boolean vis[]=new boolean[100000];
     vis[num1]=true;
int mini=Integer.MAX_VALUE;

     while (q.isEmpty()==false){
         int val=q.peek().data;
         int steps=q.peek().steps;
         q.remove();
         if(val==num2){
            return steps;
         }
         String str=String.valueOf(val);
         char ch[]=new char[str.length()];

         ch=str.toCharArray();

         for (int i = 0; i < 4 ; i++) {
             char temp=ch[i];
             for (char dig = '0'; dig <= '9'; dig++) {
if(i==0&&dig=='0'){
    continue;
}
ch[i]=dig;
String concated=new String(ch);
ch[i]=temp;
                int newVal=Integer.valueOf(concated);
                if(prime[newVal]==true&&vis[newVal]==false){
        
                    q.add(new pair(newVal,steps+1));
                    vis[newVal]=true;
                }
             }
         }
     }




     return mini; 
    }
}

//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int Num1=Integer.parseInt(input_line[0]);
            int Num2=Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.solve(Num1,Num2));
        }
    }
}
// } Driver Code Ends