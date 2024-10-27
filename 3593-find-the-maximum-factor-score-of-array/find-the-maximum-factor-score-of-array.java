class Solution {
      public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static long getScore(ArrayList<Integer> nums){
        long lcm= nums.get(0);
        long hcf=nums.get(0);
        for(int i=1;i<nums.size();i++){
            hcf=gcd(hcf,nums.get(i));
            lcm=Math.abs(lcm*nums.get(i))/gcd(lcm,nums.get(i));
        }
        return lcm*hcf;
    }
    public static long maxScore(int[] nums) {
        long ans=Long.MIN_VALUE;

ArrayList<Integer> ds=new ArrayList<>();
        for (int ele:
             nums) {
            ds.add(ele);
        }
if(nums.length==1) return nums[0]*nums[0];
        ans=Math.max(ans,getScore(ds));

        for (int i = 0; i <ds.size() ; i++) {
            int rem=ds.get(i);
        ds.remove(i);
        ans=Math.max(ans,getScore(ds));
        ds.add(i,rem);
        }



return ans;
    }
}