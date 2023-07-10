//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int matrix[][], int R, int C, int k)
    {
	
        int ans[]=new int[R*C];

        int dr[]={0,1,0,-1};
        int dc[]={1,0,-1,0};
boolean vis[][]=new boolean[R][C];

        ArrayList<Integer> list=new ArrayList<>() ;
int r=0,c=0,di=0;
        for (int i = 0; i <R*C ; i++) {
            if(i+1==k) return matrix[r][c];
            vis[r][c]=true;
            int cr= r+dr[di];
            int cc= c+dc[di];

            if(cr>=0&&cr<R&&cc>=0&&cc<C&&vis[cr][cc]==false){
                r=cr;
                c=cc;
            }
            else {
                di=(di+1)%4;
                r=r+dr[di];
                c=c+dc[di];
            }

        }
        Collections.reverse(list);
        for (int i = 0; i < list.size() ; i++) {
            ans[i]= list.get(i);
        }
        return -1;// code here
    }
}