//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] ast) {
            Stack<Integer> stk=new Stack<>();
/*if(ast.length==2)
{
    
    if(Math.abs(ast[0])==Math.abs(ast[1])){
    int ans[]=new int[0];
return ans;
    }
}*/
     for(int i=0;i<ast.length;i++){
          if(ast[i]>0 || stk.isEmpty())  stk.push(ast[i]);
    
         else{
            
             while(!stk.isEmpty()&&stk.peek()>0&&Math.abs(ast[i])>stk.peek()){
stk.pop();
    }
    if(!stk.isEmpty() && stk.peek()== Math.abs(ast[i])) 
    stk.pop();
    else{
        if(stk.isEmpty() || stk.peek() < 0) 
        stk.push(ast[i]);
    }
         }
     }   
     ArrayList<Integer> ds=new ArrayList<>();
     for(int ele:stk){
         ds.add(ele);
     }
   //  System.out.println(ds);
  
     
     int ans[]=new int[ds.size()];
    for(int i=0;i<ds.size();i++)
    ans[i]=ds.get(i);
     return ans;
    }
}
