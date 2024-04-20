class Solution {
    public static void dfs(int land[][],boolean vis[][],int maxi[][],ArrayList<ArrayList<Integer>> ans,int row,int col){

   maxi[0][0]=Math.max(maxi[0][0],row);
       maxi[0][1]=Math.max(maxi[0][1],col);


vis[row][col]=true;
int delrow[]={-1,0,1,0};
int delcol[]={0,1,0,-1};


for(int i=0;i<4;i++){
    int neirow= row+delrow[i];
int neicol=col+delcol[i];

if(neirow>=0&&neirow<land.length&&neicol>=0&&neicol<land[0].length&&vis[neirow][neicol]==false&&land[neirow][neicol]==1){
    maxi[0][2]++;
    dfs(land,vis,maxi,ans,neirow,neicol);

}
}
    }
    public int[][] findFarmland(int[][] land) {
        
        int n=land.length;
        int m=land[0].length;
boolean vis[][]=new boolean[n][m];

ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        int maxi[][]=new int[1][3];
        if(vis[i][j]==false&&land[i][j]==1){
maxi[0][0]=i;
maxi[0][1]=j;
maxi[0][2]=1;
dfs(land,vis,maxi,ans,i,j);
 //if(maxi[0][2]%4==0||maxi[0][2]==1){
    ArrayList<Integer> ds=new ArrayList<>();
    ds.add(i);
    ds.add(j);
    ds.add(maxi[0][0]);
    ds.add(maxi[0][1]);
 ans.add(ds);
 //}
        }
    }
}

//System.out.println(ans);
int i=0;
int fin[][]=new int[ans.size()][4];
for(ArrayList<Integer> ele:ans){
    System.out.println(ele);
    fin[i][0]=ele.get(0);
      fin[i][1]=ele.get(1);
        fin[i][2]=ele.get(2);
          fin[i][3]=ele.get(3);
          i++;
}

return fin;
    }
}