class Solution {
    public boolean canArrange(int[] arr, int k) {
        int freq[]=new int[k];
        int cnt=0;
for(int i=0;i<arr.length;i++)
{
    int rem= ((arr[i] % k) + k) % k;
    freq[rem]++;

}
if(freq[0]%2!=0) return false;
for(int i=1;i<=k/2;i++){
    if(freq[i]!=freq[k-i]) return false;
}
return true;
            }
}