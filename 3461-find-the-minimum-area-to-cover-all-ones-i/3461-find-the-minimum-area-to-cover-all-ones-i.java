class Solution {
    public int minimumArea(int[][] grid) {
        
int upx=-1;
int upy=-1;
int n=grid.length;
int m=grid[0].length;
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
        upx=i;
        upy=j;
        flag=true;
        break;            
                }
            }
                if(flag==true) break;
        }
int downx=-1;
int downy=-1;
             for(int i=0;i<n;i++){
                 boolean flag=false;
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
        downx=i;
        downy=j;        
                }
                
            }
                   
        }


int leftx=-1;
int lefty=-1;
             for(int j=0;j<m;j++){
                 boolean flag=false;
            for(int i=0;i<n;i++){
                if(grid[i][j]==1){
        leftx=i;
        lefty=j;
        flag=true;
        break;            
                }
                
            }
                   if(flag==true) break;
        }

        int rightx=-1;
        int righty=-1;

                     for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(grid[i][j]==1){
        rightx=i;
        righty=j;
                }
            }
        }
int widht=righty-lefty+1;
int height=downx-upx+1;
/*System.out.println(widht+" "+upx+" "+upy);
System.out.println(height+" "+downx+" "+downy);
System.out.println(height+" "+leftx+" "+lefty);
System.out.println(widht+" "+rightx+" "+righty);*/
        int ans=Math.abs(widht*height);
return ans;



    }
}