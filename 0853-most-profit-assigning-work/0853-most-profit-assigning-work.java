class Solution {
    public int maxProfitAssignment(int[] dif, int[] pro, int[] work) {
       int n=pro.length;
        int arr[][]=new int[n][2];
for(int i=0;i<n;i++){
    arr[i][0]=dif[i];
    arr[i][1]=pro[i];
}

Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
Arrays.sort(work);
int start=0;
int end=0;
int maxi=0;
int ans=0;
while(end<n&&start<work.length){
   // System.out.println(start+" "+maxi);
if(arr[end][0]<=work[start]){
maxi=Math.max(maxi,arr[end][1]);
//ans=ans+maxi;
}
else{
   ans=ans+maxi;
    start++;
    continue;
}
end++;
}

while(start<work.length){
    ans=ans+maxi;
    start++;
}

return ans;
    }
}