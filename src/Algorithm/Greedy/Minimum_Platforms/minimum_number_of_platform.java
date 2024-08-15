package Algorithm.Greedy.Minimum_Platforms;

import java.util.Arrays;

public class minimum_number_of_platform {
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here

        int count=0;
        boolean vis[]=new boolean[n];
        int time[][] =new int[n][2];
        for (int i = 0; i <n ; i++) {
            time[i][0]=arr[i];
            time[i][1]=dep[i];
        }
        Arrays.sort(time,(a,b)->Integer.compare(a[0],b[0]));

        for (int i = 0; i <n ; i++) {
            if(vis[i]==true) continue;
            vis[i]=true;
int end=time[i][1];
count++;
            for (int j = i+1; j <n ; j++) {
                if(vis[j]==false&&time[j][0]>end){
                    vis[j]=true;
                    end=time[j][1];
                }
            }
        }
    return count;
    }



    public static void main(String[] args) {
        int n=3;
        int arr[] = {900, 1100, 1235};
        int dep[] = {1000, 1200, 1240};
int ans=findPlatform(arr,dep,n);
        System.out.println(ans);
    }

}
