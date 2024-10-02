class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
     //R -D-L-U
     //Visited Array

int m=mat.length;
int n=mat[0].length;

List<Integer> ans=new ArrayList<>();


int dr[]={0,1,0,-1};
int dc[]={1,0,-1,0};
int row=0;
int col=0;
int di=0;

boolean vis[][]=new boolean[m][n];

for(int i=0;i<(n*m);i++){
ans.add(mat[row][col]);
vis[row][col]=true;
int neiRow= row  + dr[di];  // 0 + 0=0    // 0 + 0 = 0  // 0 +0 =0
int neiCol= col +dc[di];    // 0 + 1=1   // 1 + 1 = 2   // 2+1=3

//

if(neiRow>=0&& neiRow<m && neiCol>=0 && neiCol<n && vis[neiRow][neiCol]==false)
{
row=neiRow;
col=neiCol;
}
else {
 di=(di+1)%4;
  row= row+dr[di];
  col= col+ dc[di];
}
// 1 , 0 
// 0,0
 // di= 3  (3+1)%4==0 di= 0
// row= 1 col =0   1,1   1 +dr[0]= 1 +0 =1  row =1
// col 0                 0 +dc[0] =0 +1 = 1 col =1  


}
return ans;
     


    }
}