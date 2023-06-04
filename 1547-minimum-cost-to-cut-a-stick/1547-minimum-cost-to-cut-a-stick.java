class Solution {
      public static int getMinCost(ArrayList<Integer> cuts,int i,int j,int dp[][]){
        if (i>j) return 0;
if(dp[i][j]!=-1) return dp[i][j];
   int mini=Integer.MAX_VALUE;
        for (int ind = i; ind <=j ; ind++) {
            int ans= cuts.get(j+1) -cuts.get(i-1)+ getMinCost(cuts,i,ind-1,dp)+getMinCost(cuts,ind+1,j,dp);
            mini=Math.min(mini,ans);
        }

return dp[i][j]=mini;
    }
    public int minCost(int n, int[] cuts) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.stream(cuts).boxed().collect(Collectors.toList()));
    list.add(n);
    list.add(0,0);
    int cutSize= cuts.length;
    Collections.sort(list);
    int dp[][]=new int[cutSize+1][cutSize+1];
        for (int rows[]:
            dp ) {
            Arrays.fill(rows,-1);
        }

        return getMinCost(list,1,cutSize,dp);
    }
}