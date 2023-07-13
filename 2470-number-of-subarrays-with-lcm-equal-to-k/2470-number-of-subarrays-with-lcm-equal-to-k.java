class Solution {
    public static int gcd(int a,int b){
    
        if(b==0) 
        return a;
    
    return gcd(b,a%b);
    }
    public int subarrayLCM(int[] nums, int k) {
    int count=0;
       for(int i=0;i<nums.length;i++){
int lcm=nums[i];
if(lcm==k) count++;
    for(int j=i+1;j<nums.length;j++){
 lcm=(lcm*nums[j])/gcd(lcm,nums[j]); 
if(lcm==k){
count++;
}    
if(lcm>k) break;
       } 

       }
       return count; 
    }
}