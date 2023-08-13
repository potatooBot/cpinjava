class Solution {
    public int minSubarray(int[] nums, int p) {
           long sum=0;
        for (int ele:
             nums) {
            sum+=ele;
        }
int remIni=(int)(sum%p);
        if(sum%p==0) return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        sum=0;
        int ans= nums.length;;
        for (int i = 0; i < nums.length ; i++) {
            sum=sum+nums[i];
            int curRem=(int)(sum%p);
            int searchor=curRem- remIni;
            if(searchor<0){
                searchor=searchor+p;
            }
            if(map.containsKey(searchor)){
                ans=Math.min(ans,i-map.get(searchor));
            }
            map.put(curRem,i);
        }

        if(ans== nums.length) return -1;
return ans; 
    }
}