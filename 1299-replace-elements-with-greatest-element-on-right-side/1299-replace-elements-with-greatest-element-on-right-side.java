class Solution {
    public int[] replaceElements(int[] arr) {
        int ans[]=new int[arr.length];
int n= arr.length;
int maxi=-1;
        for (int i =n-1 ; i >=0 ; i--) {
            ans[i]=maxi;
            maxi=Math.max(maxi,arr[i]);
        }
        return ans;
    }
}