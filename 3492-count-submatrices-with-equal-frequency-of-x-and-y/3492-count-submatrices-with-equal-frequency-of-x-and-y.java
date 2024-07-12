class pair{
    int first;
    int second;
    pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}

class Solution {
    public int numberOfSubmatrices(char[][] grid) {
int n=grid.length;
int m=grid[0].length;
pair mat[][]=new pair[n][m];

for(int i=0;i<n;i++){
    if(grid[i][0]=='X'){
mat[i][0]=new pair(1,0);
    }
    else if(grid[i][0]=='Y'){
        mat[i][0]=new pair(0,1);
    }
    else{
        mat[i][0]=new pair(0,0);
    }
}


for(int i=0;i<n;i++){
    for(int j=1;j<m;j++){
        mat[i][j]=new pair(mat[i][j-1].first,mat[i][j-1].second);
          if(grid[i][j]=='X'){
mat[i][j].first++;
    }
    else if(grid[i][j]=='Y'){
        mat[i][j].second++;
    }
    }
}

for(int i=1;i<n;i++){
    for(int j=0;j<m;j++){
mat[i][j].first=mat[i][j].first+mat[i-1][j].first;
        mat[i][j].second=mat[i][j].second +mat[i-1][j].second;
    
    }
 
}
int ans=0;
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
          // System.out.print(mat[i][j].first+""+mat[i][j].second+" ");
if(mat[i][j].first>0&&mat[i][j].first==mat[i][j].second){
    ans++;
}
    }
     //  System.out.println();
}
return ans;

    }
}