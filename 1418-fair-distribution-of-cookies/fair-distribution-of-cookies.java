class Solution {
    public int distributeCookies(int[] cook, int k) {
        int child[]= new int[k];
 int res[]=new int[1];
res[0]=Integer.MAX_VALUE;
dfs(cook,0,k,child,res);

return res[0];
    }
    public static void dfs(int ck[],int cur,int k,int child[],int res[]){
        if(cur==ck.length){
            int maxi=-1;
            for(int ele:child){
                maxi=Math.max(maxi,ele);
            }
                res[0]=Math.min(res[0],maxi);
                return;
        }


        for(int i=0;i<k;i++){
            child[i]=child[i]+ck[cur];
            dfs(ck,cur+1,k,child,res);
            child[i]=child[i]-ck[cur];
        }
    }
}