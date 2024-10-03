class Solution {
public static int memo(List<List<Integer>> tri,int row,int col,int dp[][]){
    if(row==tri.size()-1){
        return tri.get(row).get(col);
    }


if(dp[row][col]!=-1) return dp[row][col];


int down=tri.get(row).get(col)+   memo(tri,row+1,col,dp);
int diag=tri.get(row).get(col)+   memo(tri,row+1,col+1,dp);
return dp[row][col]=Math.min(down,diag);
}

    public int minimumTotal(List<List<Integer>> tri) {



int dp[][]=new int[tri.size()][tri.size()+1];
for(int rows[]:dp)

Arrays.fill(rows,-1);
return memo(tri,0,0,dp);


    }
}