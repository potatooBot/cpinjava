class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        

int row[][]=new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
int cnt=0;
          for(int j=0;j<mat[0].length;j++){
if(mat[i][j]==1){
  cnt++;
}

          }
        row[i][0]=i;
        row[i][1]=cnt;
        }
        
        int ans[]=new int[k];
     
     Arrays.sort(row,(a,b)->Integer.compare(a[1],b[1]));
        for(int r[]:row)
        System.out.println(Arrays.toString(r));
    for(int i=0;i<=k-1;i++){
ans[i]=row[i][0];
    }
        return ans;
    }
}