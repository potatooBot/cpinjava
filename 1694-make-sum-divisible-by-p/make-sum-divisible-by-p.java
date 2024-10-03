class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum=0;
        for(int ele:nums) sum+=ele;

int ans=nums.length;
        int remIni=(int)(sum%p);
        HashMap<Integer,Integer> map=new HashMap<>();
map.put(0,-1);
if(sum%p==0) return 0;
sum=0;
for(int end=0;end<nums.length;end++){
sum=sum+nums[end];

int rem=(int)(sum%p);
int searchval=rem-remIni;
if(searchval<0)
{
    searchval=searchval+p;
}


if(map.containsKey(searchval)){
    ans=Math.min(ans,end-map.get(searchval));
}

map.put(rem,end);

}

if(ans==nums.length) return -1;

return ans;
    }
}