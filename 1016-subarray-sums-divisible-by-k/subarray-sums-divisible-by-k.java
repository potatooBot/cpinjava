class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
    int cnt=0;
    int sum=0;
    map.put(0,1);
    for(int i=0;i<nums.length;i++){
    sum=sum+nums[i];
int rem=sum%k;
    if(rem<0){
        rem=rem+k;
    }

if(map.get(rem)!=null){
cnt=cnt+map.get(rem);
}
map.put(rem,map.getOrDefault(rem,0)+1);


    }
return cnt;
    }
}