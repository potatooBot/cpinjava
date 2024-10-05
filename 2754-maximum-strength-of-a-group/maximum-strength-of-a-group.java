class Solution {
    public long maxStrength(int[] nums) {
        Arrays.sort(nums);
        boolean pos=false;
        if(nums[nums.length-1]>0) pos=true;
        boolean zero=false;
        for(int ele:nums) 
        if(ele==0) zero=true;
if(nums.length==2&&nums[0]<0&nums[1]==0) return 0;
if(nums.length==1) return nums[0];

        long ans=1;
        int cnt=0;
        for(int ele:nums) if(ele<0) cnt++;
if(pos==false&&zero==true&&cnt==1) return 0;
        if(pos==false&&cnt==0) return 0;
        if(cnt%2==0){
        for(int ele:nums){
            if(ele<0)
            ans=ans*ele;
        }    
        }
        else if(cnt%2==1){
           for(int ele:nums){
        if(ele<0){
            if(cnt==1) break;
            ans=ans*ele;
            cnt--;
        }   
           }
        }
System.out.println(ans);
        for(int ele:nums)
        if(ele>0) ans=ans*ele; 
 return ans;
    }
}