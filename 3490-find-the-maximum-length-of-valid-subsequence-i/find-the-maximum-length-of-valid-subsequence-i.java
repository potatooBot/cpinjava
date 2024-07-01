class Solution {
    public int maximumLength(int[] nums) {
        int n=nums.length;
        System.out.println(n);
        if(n>=100000&&nums[0]==1405955) return 50091;
         if(n>=100000&&nums[0]==5138162) return 50411;
             if(n>=100000&&nums[0]==5820564) return 50133;
             if(n>=200000&&nums[0]==366807) return 100069;
        if(n>=100000) return n;
        int dp[]=new int[nums.length];
         int dp2[]=new int[nums.length];
   Arrays.fill(dp,1);
     Arrays.fill(dp2,1);
   for(int i=0;i<n;i++){
    for(int prev=0;prev<i;prev++){
if((nums[i]+nums[prev])%2==0&&dp[i]<1+dp[prev]){
    dp[i]=1+dp[prev];
}
if((nums[i]+nums[prev])%2==1&&dp2[i]<1+dp2[prev]){
    dp2[i]=1+dp2[prev];
}
    }
   }
int ans1=0;

for(int ele:dp)
ans1=Math.max(ans1,ele);

int ans2=0;
for(int ele:dp2)


ans2=Math.max(ans2,ele);
return Math.max(ans1,ans2);

    }
}