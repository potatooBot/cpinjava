//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] inval)
    {
        Arrays.sort(inval,(a,b)->Integer.compare(a[0],b[0]));
int idx=0;
ArrayList<ArrayList<Integer>> interval=new ArrayList<>();

        for (int i = 0; i <inval.length ; i++) {
            interval.add(new ArrayList<>());
        }
        for (int i = 0; i <inval.length ; i++) {
            for (int it:
                 inval[i]) {
                interval.get(i).add(it);
            }
        }
       
        for (int i = 0; i <interval.size()-1 ; i++) {
            if(interval.get(i).get(1)>=interval.get(i+1).get(0)){
                if(interval.get(i+1).get(1)>interval.get(i).get(1)) {
                    interval.get(i).set(1, interval.get(i + 1).get(1));
                    interval.remove(i + 1);
                }
                else {
                    interval.get(i).set(1, interval.get(i).get(1));
                    interval.remove(i + 1);
                }
                i--;
            }
        }
        int ans[][]=new int[interval.size()][2];
        for (int i = 0; i <interval.size() ; i++) {

                ans[i][0]=interval.get(i).get(0);
                ans[i][1]=interval.get(i).get(1);

        }
return ans;
    }
}