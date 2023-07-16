class Solution {
    public static int gcd(int a,int b){

if(b==0) return a;

return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
  
        int maxi=-10000;
        int mini=10000;
        for(int i=0;i<nums.length;i++){
if(mini>nums[i]){
    mini=nums[i];
}
if(maxi<nums[i]){
    maxi=nums[i];
}
        }
    
    return gcd(maxi,mini);
    }
}