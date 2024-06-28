class Solution {
    public long maximumImportance(int n, int[][] roads) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
 for(int i=0;i<n;i++){
    adj.add(new ArrayList<>());
 }
int nums[][]=new int[n][2]; 
 for(int arr[]:roads){
    adj.get(arr[0]).add(arr[1]);
 adj.get(arr[1]).add(arr[0]);

 }
for(int i=0;i<adj.size();i++){
nums[i][0]=i;
nums[i][1]=adj.get(i).size();
    }
 Arrays.sort(nums,(a,b)->Integer.compare(b[1],a[1]));


//System.out.println(Arrays.toString(arr));
int val[]=new int[n];
int sz=n;
for(int arr[]:nums){
    val[arr[0]]=sz;
    sz--;
}
long ans=0;
for(int i=0;i<adj.size();i++){
ArrayList<Integer> ds=adj.get(i);
int value=val[i];
for(int j=0;j<ds.size();j++){
 ans=ans+ (value+val[ds.get(j)]);
}
    }

return ans/2;
    }
}