class Solution {
    public int mySqrt(int n) {
    long low=1;
    long high=n;
    int ans=0;
    while(low<=high){
       long mid=(low+high)/2;
        if(mid*mid==n){
            ans=(int)mid;
            break;
        }

        else if(mid*mid<n){
ans=(int)mid;
low=mid+1;
        }
        else {
            high=mid-1;
        }
    }

    return ans;
    }
}