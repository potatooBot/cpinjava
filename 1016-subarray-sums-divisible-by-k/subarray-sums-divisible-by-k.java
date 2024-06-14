class Solution {
    public int subarraysDivByK(int[] nums, int k) {
     HashMap<Integer,Integer> map=new HashMap<>();
map.put(0,1);
int sum=0;
int cnt=0;
     for(int i=0;i<nums.length;i++)   
    {
sum=sum+nums[i];
int rem=sum%k;

//ystem.out.println(rem);
if(rem<0) 
{
    rem=rem+k;
}


if(map.containsKey(rem)==true){
    cnt=cnt+map.get(rem);
}
map.put(rem,map.getOrDefault(rem,0)+1);

    }
    return cnt;
    }
}