import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
       BigInteger val=new BigInteger(s,2);
int cnt=0;
BigInteger two=new BigInteger("2");
BigInteger one=new BigInteger("1");
BigInteger zero=new BigInteger("0");
//System.out.println(val);
        while(!val.equals(one)){
            if(val.remainder(two).equals(zero)){
                val=val.divide(two);
            }
            else{
                val=val.add(one);
            }
cnt++;
        }
        return cnt;
    }
}