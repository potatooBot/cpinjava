class Solution {
    public long[] sumOfThree(long num) {
        long cap=(int)num/3;
long ans[]=new long[3];
long res[]=new long[0];
if(num%3!=0) return res;
long quo=num/3;
ans[0]=quo-1;
ans[1]=quo;
ans[2]=quo+1;
return ans;
    }
}