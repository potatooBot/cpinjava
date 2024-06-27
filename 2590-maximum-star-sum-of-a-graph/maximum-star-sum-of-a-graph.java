class Solution {
    public int maxStarSum(int[] vals, int[][] edges, int sz) {
         ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
int n=vals.length;
        for(int i=0;i<=n+1;i++){
            adj.add(new ArrayList<>());
        } 

        for(int arr[]:edges){
            adj.get(arr[0]).add(arr[1]);
            adj.get(arr[1]).add(arr[0]);
        }
int sum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
ArrayList<Integer> ds=new ArrayList<>();
for(int j=0;j<adj.get(i).size();j++){
ds.add(vals[adj.get(i).get(j)]);

        }
        Collections.sort(ds);
        int val=vals[i];
        int cnt=0;
      //  System.out.println(ds);
        for(int k=0;k<ds.size();k++){
            if(ds.get(ds.size()-k-1)<0) continue;
if(cnt==sz) break;
val=val+ds.get(ds.size()-k-1);
cnt++;
      // System.out.println(val);
        }
        sum=Math.max(sum,val);
        val=0;
        ds.clear();
        }
        return sum;
    }
}