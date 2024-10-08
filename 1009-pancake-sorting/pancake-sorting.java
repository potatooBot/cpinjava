class Solution {
    public int getMaxi(int arr[],int n){
        int idx=0;
        int maxi=arr[idx];
        for(int i=0;i<=n;i++){
        if(maxi<arr[i]){
            idx=i;
            maxi=arr[idx];
        }
        }
        return idx;
    }
    public void reverse(int arr[],int st,int end){
        while(st<=end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
    public static boolean isSorted(int[] a) 
{
    //int i;
    for(int i=0;i<a.length-1;i++){
        if (a[i] > a[i+1]) {
            return false;
        } 
    }

    return true;
}
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans=new ArrayList<>();

int n=arr.length;
if(isSorted(arr)==true) return ans;
        for(int i=n-1;i>=0;i--){
            if(isSorted(arr)==true) return ans;

            int maxIdx=getMaxi(arr,i);
            ans.add(maxIdx+1);

        reverse(arr,0,maxIdx);
            if(isSorted(arr)==true) return ans;
        //System.out.println(Arrays.toString(arr));
        ans.add(i+1);
        reverse(arr,0,i);
        if(isSorted(arr)==true) return ans;

          // System.out.println(Arrays.toString(arr));
        }


        return ans;
    }
}