package DSA.DFS;

public class interleaving_strings {
    static  public boolean isInterleave(String s1, String s2, String s3) {
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

        // ! Already Visited Then return false

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
    public static void main(String[] args) {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        boolean ans=isInterleave(s1,s2,s3);
        System.out.println(ans);
    }
}
