class Solution {
    public boolean judgeSquareSum(int c) {
      long low=0;
    long high=(long)Math.sqrt(c);
        while(low<=high){
            long val=(long)((long)Math.pow(low,2)+(long)Math.pow(high,2));
          long mid=(low+high)/2;
            //System.out.println(val);
        /*if(val==c) return true;
        else if(val>c){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        }*/
        if(val==c) return true;
        if(val>c) high--;
        else low++;
        }
        return false;
    }
}