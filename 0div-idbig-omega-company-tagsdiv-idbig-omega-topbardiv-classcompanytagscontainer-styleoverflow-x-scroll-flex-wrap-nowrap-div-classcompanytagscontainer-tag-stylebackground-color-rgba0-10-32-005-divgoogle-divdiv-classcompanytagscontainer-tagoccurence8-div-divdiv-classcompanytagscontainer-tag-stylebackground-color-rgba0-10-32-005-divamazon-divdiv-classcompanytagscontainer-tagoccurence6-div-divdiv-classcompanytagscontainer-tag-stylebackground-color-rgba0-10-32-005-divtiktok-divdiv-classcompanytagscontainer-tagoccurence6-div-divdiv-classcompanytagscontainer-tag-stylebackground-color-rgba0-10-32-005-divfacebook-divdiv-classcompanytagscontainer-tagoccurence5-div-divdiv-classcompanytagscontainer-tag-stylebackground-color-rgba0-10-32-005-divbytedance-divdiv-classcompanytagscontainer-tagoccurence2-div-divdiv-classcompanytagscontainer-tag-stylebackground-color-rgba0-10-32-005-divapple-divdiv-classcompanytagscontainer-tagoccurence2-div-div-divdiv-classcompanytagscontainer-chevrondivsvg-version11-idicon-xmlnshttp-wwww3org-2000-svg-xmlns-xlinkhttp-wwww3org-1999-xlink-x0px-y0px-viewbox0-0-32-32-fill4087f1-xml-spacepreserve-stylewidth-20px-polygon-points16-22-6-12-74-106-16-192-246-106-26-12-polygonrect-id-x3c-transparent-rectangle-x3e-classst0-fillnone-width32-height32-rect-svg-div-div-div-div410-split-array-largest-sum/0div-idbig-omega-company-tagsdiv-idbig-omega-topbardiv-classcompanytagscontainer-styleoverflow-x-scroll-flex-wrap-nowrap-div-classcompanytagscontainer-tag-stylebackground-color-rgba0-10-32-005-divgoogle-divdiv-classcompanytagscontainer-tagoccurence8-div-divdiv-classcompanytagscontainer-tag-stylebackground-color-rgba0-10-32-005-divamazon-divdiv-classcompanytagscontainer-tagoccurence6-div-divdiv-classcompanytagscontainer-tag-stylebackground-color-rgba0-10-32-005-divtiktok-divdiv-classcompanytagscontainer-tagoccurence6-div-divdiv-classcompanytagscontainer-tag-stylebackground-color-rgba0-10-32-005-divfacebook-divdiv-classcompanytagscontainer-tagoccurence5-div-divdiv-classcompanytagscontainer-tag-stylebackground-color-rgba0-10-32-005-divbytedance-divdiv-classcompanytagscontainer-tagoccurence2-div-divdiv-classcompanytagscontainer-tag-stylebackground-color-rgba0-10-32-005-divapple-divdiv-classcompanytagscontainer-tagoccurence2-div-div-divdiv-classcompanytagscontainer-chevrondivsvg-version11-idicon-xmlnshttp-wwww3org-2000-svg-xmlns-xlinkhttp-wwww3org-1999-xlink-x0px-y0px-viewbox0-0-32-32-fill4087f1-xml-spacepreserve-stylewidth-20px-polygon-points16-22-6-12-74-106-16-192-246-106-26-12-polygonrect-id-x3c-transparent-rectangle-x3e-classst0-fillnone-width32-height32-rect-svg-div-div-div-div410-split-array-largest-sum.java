class Solution {
 public static boolean checkSubarray(int nums[],int k, int maxSum){
int cntSubarray=1;
int subarraySum=0;


for(int ele:nums){
    subarraySum=subarraySum+ele;
if(subarraySum>maxSum){
subarraySum=ele;
cntSubarray++;

if(cntSubarray>k){
    return false;
}
}

}
return true;
 }

    public int splitArray(int[] nums, int k) {
        
int sum=0;
int maxi=0;


for(int ele:nums)
{
    sum=sum+ele;
    maxi=Math.max(maxi,ele);
}
int ans=10000000;
int low=maxi;
int high=sum;
while(low<high){
    int mid=low+(high-low)/2;

if(checkSubarray(nums,k,mid)==true){
    ans=Math.min(ans,mid);
    high=mid;
}
else{
    low=mid+1;
}

}


return low;
    }
}