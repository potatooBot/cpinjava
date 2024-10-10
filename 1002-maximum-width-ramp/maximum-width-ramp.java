class Solution {
    public int maxWidthRamp(int[] nums) {
        int arr[][]=new int[nums.length][2];

        for(int i=0;i<nums.length;i++){
            arr[i][0]=i;
            arr[i][1]=nums[i];
        }

        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));

      //  for(int rows[]:arr)
//System.out.println(Arrays.toString(rows));

        int ans=0;
        int mini=arr[0][0];
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,arr[i][0]-mini);
            mini=Math.min(mini,arr[i][0]);
           // System.out.println(mini);
        }
        return ans;
    }
}