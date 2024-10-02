class Solution {
    public int[] arrayRankTransform(int[] nums) {
     int arr[]=new int[nums.length];

     for(int j=0;j<arr.length;j++)
     arr[j]=nums[j]; 

     Arrays.sort(nums);
     HashMap<Integer,Integer> map=new HashMap<>(); 
int i=1;
     for(int ele:nums) 
     {
        if(map.containsKey(ele)) continue;
         map.put(ele,i);
         i++;
     }
     //System.out.println(map);
     int ans[]=new int[arr.length];
     for(int j=0;j<arr.length;j++){
        ans[j]=map.get(arr[j]);
             }

             return ans;
         }
}