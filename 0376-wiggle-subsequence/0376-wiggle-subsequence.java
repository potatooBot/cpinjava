class Solution {
    public int wiggleMaxLength(int[] nums) {
                int n=nums.length;     
if(n<2) return n;
int prev=nums[1]-nums[0];
int count=prev!=0?2:1;                 
for(int i=2;i<n;i++){
int diff=nums[i]-nums[i-1];
if((diff>0&&prev<=0)||(diff<0&&prev>=0)){
    count++;
    prev=diff;
}

}




return count;
    }
}