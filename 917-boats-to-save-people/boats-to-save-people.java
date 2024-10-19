class Solution {
    public int numRescueBoats(int[] peo, int lim) {
        int ans=0;

Arrays.sort(peo);
System.out.println(Arrays.toString(peo));
       int start=0;
       int end=peo.length-1;
       while(start<=end){
        long sum=peo[start]+peo[end];

        if(sum>lim){
            ans++;
            end--;

        }
        else if(sum<=lim){
            ans++;
            end--;
            start++;
        }

       }
       
    
        return ans;
    }
}