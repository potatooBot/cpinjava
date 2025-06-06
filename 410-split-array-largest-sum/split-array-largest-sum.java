class Solution {
    public static int countSplit(int mid,int ck[]){
    int stu=1;
    int cook=0;
for(int ele:ck){
if(cook+ele<=mid){
    cook=cook+ele;
}
else{
    stu++;
    cook=ele;
}
}
return stu;

}
    public int splitArray(int[]ck, int k) {
           int maxi=-1;
        int sum=0;
        for(int ele:ck){
            maxi=Math.max(maxi,ele);
            sum=sum+ele;
        }
        int low=maxi;
        int high=sum;
int ans=0;
while(low<=high){
    int mid=(low+high)/2;

int slt=countSplit(mid,ck);
if(slt>k){
    low=mid+1;

}
else{
    ans=mid;
    high=mid-1;
}

}
return ans;
    }
}