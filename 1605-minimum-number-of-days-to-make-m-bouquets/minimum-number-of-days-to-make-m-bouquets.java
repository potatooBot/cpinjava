class Solution {
public static int getCount(int val,int arr[],int m,int k){
int cnt=0;
int ans=0;

for(int i=0;i<arr.length;i++){
    if(arr[i]<=val){
        cnt++;
    }
    else{
        ans=ans+ cnt/k;
       // System.out.println(cnt+" "+ans+" val="+val);
        cnt=0;
    }
}
 ans=ans+ cnt/k;
return ans;
}
    public int minDays(int[] bloom, int m, int k) {
        int low=0;
        int high=0;
        for(int ele:bloom) high=Math.max(ele,high);
int ans=Integer.MAX_VALUE;
while(low<=high){
    int mid=(low+high)/2;
    int val=getCount(mid,bloom,m,k);
    if(val>=m){
high=mid-1;
ans=Math.min(ans,mid);
    }
    else{
        low=mid+1;
    }
}

if(ans==Integer.MAX_VALUE){
    return -1;
}
return ans;

    }
}