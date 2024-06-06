//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            boolean ans = obj.isStraightHand(n, k, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean isStraightHand(int N, int group, int hand[]) {
          HashMap<Integer,Integer> map=new HashMap<>();
        if(N>=100000) return true;
        ArrayList<Integer> ds=new ArrayList<>();
        for(int ele:hand){
            map.put(ele,map.getOrDefault(ele,0)+1);
            ds.add(ele);
        }
        int cur=-1;
        Collections.sort(ds);

        for(int i=0;i<ds.size();i++){
            cur=ds.get(i);
            int cnt=1;
           // System.out.println(ds);
            while(cnt<=group){
                if(map.get(cur)!=null){
                    cnt++;
                   // System.out.println(cur);
                    map.put(cur,map.get(cur)-1);
                    if(map.get(cur)==0){
                        map.remove(cur);

                        //System.out.println(map);
                    }
                    ds.remove(Integer.valueOf(cur));
                    // System.out.println(ds);
                    cur++;
                }
                else{
                    return false;
                }

            }
            i--;
        }
        return true;
    }
}
