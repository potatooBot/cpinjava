//{ Driver Code Starts
//initial code
import java.util.*;
import java.lang.*;
class InterLeaveString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String a =sc.next();
            String b = sc.next();
            String c = sc.next();
            Solution g=new Solution();
        
            System.out.println(g.isInterLeave(a,b,c)==true?1:0);
            t--;
        }
    }
}


// } Driver Code Ends


/*you are required to complete this method */
class Solution {
	public boolean isInterLeave(String s1,String s2,String s3)
	{
         if(s1.length()+s2.length()==s3.length()) {
    boolean vis[][]=new boolean[s1.length()+1][s2.length()+1];
    return dfs(s1,0,s2,0,s3,0,vis);
}
return false;
	}
	    public static boolean dfs(String s1,int i,String s2,int j,String s3,int k,boolean vis[][]){
        if(i==s1.length()&&j==s2.length()){
            return true;

        }

        if(i>s1.length()||j>s2.length()){
            return false;
        }
        if(vis[i][j]!=false) {
            return false;
        }

            vis[i][j]=true;
        boolean a=false,b=false;
        if(i<s1.length()&&s1.charAt(i)==s3.charAt(k)){
            a=dfs(s1,i+1,s2,j,s3,k+1,vis);
        }
        if(j<s2.length()&&s2.charAt(j)==s3.charAt(k)){
            b=dfs(s1,i,s2,j+1,s3,k+1,vis);
        }
    return a||b;
    }
}

