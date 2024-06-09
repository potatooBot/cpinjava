class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int arr[]=new int[n];
Arrays.fill(arr,1);
int mod=(int)(Math.pow(10,9)+7);
        for(int i=1;i<=k;i++){
int sum=0;
for(int j=0;j<n;j++){
sum=(sum+arr[j])%mod;
arr[j]=sum%mod;
}
//System.out.println(Arrays.toString(arr));
        }
return arr[n-1];
    }
}