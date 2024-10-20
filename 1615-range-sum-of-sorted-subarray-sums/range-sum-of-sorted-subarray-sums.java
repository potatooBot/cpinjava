class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> ds=new ArrayList<>();
  
for(int i=0;i<n;i++){
    int sum=0;
    for(int j=i;j<n;j++){
        sum=sum+nums[j];
        
        ds.add(sum);
    }
}
int ans=0;
Collections.sort(ds);

int MOD=(int)Math.pow(10,9) +7;
for(int i=left;i<=right;i++){

    if(i-1>=ds.size()) return ans;
ans=(ans+ds.get(i-1))%MOD;
}

return ans%MOD;
    }
}