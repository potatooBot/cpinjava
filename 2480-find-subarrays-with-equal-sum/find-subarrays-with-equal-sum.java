class Solution {
    public boolean findSubarrays(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       if(nums.length<=2) return false;
//map.put(0,1);
int sum=0;
int start=0;
       for(int i=0;i<nums.length;i++){
      //  if(i-start+1==2)
        sum=sum+nums[i];
        if(i-start+1>2){
            sum=sum-nums[start];
            start++;
        }
System.out.println(sum);
        if(map.get(sum)!=null&&map.get(sum)!=0) return true;
       map.put(sum,i);
       } 
       return false;
    }
}