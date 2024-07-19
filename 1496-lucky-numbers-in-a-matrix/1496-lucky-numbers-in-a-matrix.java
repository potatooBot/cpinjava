class Solution {
    public static int[] getLucky(int row,int col,int mat[][]){
        
        int mini=Integer.MAX_VALUE;
    for(int j=0;j<mat[0].length;j++){
        mini=Math.min(mini,mat[row][j]);
    }
        
      int maxi=Integer.MIN_VALUE;
            for(int i=0;i<mat.length;i++){
                maxi=Math.max(maxi,mat[i][col]);
            }
        int ans[]=new int[2];
        ans[0]=mini;
        ans[1]=maxi;
        return ans;
        
    }
    public List<Integer> luckyNumbers (int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        
        int row[]=new int[n];
        int col []=new int[m];
        
        List<Integer> ans=new ArrayList<>();
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        int res[]=getLucky(i,j,mat);
            if(res[0]==res[1]){
                ans.add(res[0]);
            }
        }
    }

        
        
        return ans;
        
        
        
    }
}