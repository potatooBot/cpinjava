package Graph;
//Expected Time Compelxity: O(n*m)
//Expected Space Complexity: O(n*m)
public class flood_fill {

    public static void dfs(int [][]image,int[][]vis,int row,int col,int newColor,int iniColor,int delrow[],int delcol[])
    {
        vis[row][col]=newColor;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int neighrow=row+delrow[i];
            int neighcol=col+delcol[i];

            if(neighrow>=0&&neighrow<n&&neighcol>=0&&neighcol<m&&image[neighrow][neighcol]==iniColor&&vis[neighrow][neighcol]!=newColor){

                dfs(image,vis,neighrow,neighcol,newColor,iniColor,delrow,delcol);

            }
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here
        int iniColor=image[sr][sc];
        int [][]vis=image;
        int delrow[]={-1,0,+1,0};
        int delcol[]={0,1,0,-1};

        dfs(image,vis,sr,sc,newColor,iniColor,delrow,delcol);
        return vis;
    }
    public static void main(String[] args) {
        int [][] image = {{1,1,1},
                {1,1,0},
                {1,0,1}};
        int sr = 1, sc = 1, newColor = 2;
        int ans[][]=floodFill(image,sr,sc,newColor);
        for (int i = 0; i <ans.length ; i++) {

            for (int j = 0; j <ans[0].length ; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
