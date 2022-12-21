package Graph;

import java.util.HashSet;

public class find_the_town_judge {
    public static int findJudge(int n, int[][] trust) {
        int count[] = new int[n+1];

        for(int t[] : trust){
            System.out.println(t[0]);
            count[t[0]]--;     // outdegree
            System.out.println(t[1]);
            count[t[1]]++;   // indegree
        }

        for(int i=1;i<=n;i++){
            System.out.println(count[i]);
            if(count[i]==n-1) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [][]trust = {{1,3},{2,3}};
        int n=3;
        int res=findJudge(n,trust);
        System.out.println(res);
        
    }
}
