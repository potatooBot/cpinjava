class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flag=true;
       if(nums.length==1) return true;
        int first=nums[0];
int second=nums[1];
for(int i=0;i<nums.length-1;i++) {
if(first==second){
first=nums[i];
second=nums[i+1];
}
}
if(first<=second){
 for(int i=0;i<nums.length-1;i++){
    if(nums[i]<=nums[i+1]) {
        flag=true;
    }
    else {
        return false;
    }
 }
}
if(first>=second){
     for(int i=0;i<nums.length-1;i++){
    if(nums[i]>=nums[i+1]) {
        flag=true;
    }
    else {
        return false;
    }
     }
}
        

        return flag ;
    }
}