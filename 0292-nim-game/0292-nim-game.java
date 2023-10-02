class Solution {
    public boolean canWinNim(int n) {
    /* if(n<=3) return true;
      int quo=n/3;

      int rem=n%3;
      if(quo%2==0&&rem==0) return false;
     if(quo%2!=0&&rem>0) return false;
      return true;  */
      return n%4!=0;
    }
}