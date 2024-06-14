class Solution {
        public static int merge(int arr[],int low,int mid,int high){
        int left=low;
        int cnt=0;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
                
            }
            else{
                temp.add(arr[right]);
            cnt=cnt+(mid-left+1);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
         for(int i=low;i<=high;i++){
             arr[i]=temp.get(i-low);
         } 
      //   System.out.println(mid-left+1);
        return cnt;
    }
    
public static int mergeSort(int arr[],int low,int high){
    int cnt=0;
    if(low>=high) return cnt;
    
    
    int mid=(low+high)/2;
    cnt=cnt+mergeSort(arr,low,mid);
    cnt=cnt+mergeSort(arr,mid+1,high);
    cnt=cnt+merge(arr,low,mid,high);
return cnt;
    
}
public static int local(int nums[]){
    int count=0;
for(int i=0;i<nums.length-1;i++){
    //System.out.println(i);
if(nums[i]>nums[i+1]){
    count++;
}

}
return count;

}
    public boolean isIdealPermutation(int[] nums) {
 int nums2[]=new int[nums.length];
 for(int i=0;i<nums.length;i++){
    nums2[i]=nums[i];
 }       
 int cnt=mergeSort(nums,0,nums.length-1);
 
 int cnt2=local(nums2);       
//System.out.println(cnt+" "+cnt2);
if(cnt==cnt2) return true;
return false;
    }
}