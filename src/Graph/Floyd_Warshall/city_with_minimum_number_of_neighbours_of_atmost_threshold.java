package Graph.Floyd_Warshall;

public class city_with_minimum_number_of_neighbours_of_atmost_threshold {
    static  int findCity(int n, int m, int[][] edges,int distanceThreshold)
    {
     int distArr[][]=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                distArr[i][j]=Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i <n ; i++) {
            distArr[i][i]=0;
        }
     // ? Adjency Matrix
        for (int i = 0; i <m ; i++) {
          int u=edges[i][0];
          int v=edges[i][1];
          int wt=edges[i][2];
          distArr[u][v]=wt;
          distArr[v][u]=wt;
        }

        for (int via = 0; via <n ; via++) {
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {

                    if(distArr[i][via] ==Integer.MAX_VALUE||distArr[via][j]==Integer.MAX_VALUE) continue;
                    distArr[i][j]=Math.min(distArr[i][j],distArr[i][via] +distArr[via][j]);
                }
            }
        }
int cityNo=-1;
        int prevCount=n;
        for (int i = 0; i <n ; i++) {
        int count=0;
            for (int j = 0; j <n ; j++) {
                if(distArr[i][j]<=distanceThreshold){
                    count++;
                }


            }
            if(count<=prevCount)
            {
                cityNo=i;
                prevCount=count;
            }

        }
     return cityNo;   //code here
    }
    public static void main(String[] args) {
        int N=4,M=4;
        int [][]edges = {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
        int ans=findCity(N,M,edges,4);
        System.out.println(ans);

    }
}
