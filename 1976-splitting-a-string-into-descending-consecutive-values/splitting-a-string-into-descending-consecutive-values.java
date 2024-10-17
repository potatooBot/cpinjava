import java.math.BigInteger;

class Solution {
    public static void backtrack(String s,int idx,boolean ans[],BigInteger prev,ArrayList<String> ds,boolean flag) {


        if (idx >= s.length()&&flag==true) {
            ans[0] = true;
            return;
        }

        for (int i = idx; i < s.length(); i++) {

            if (idx == 0) {
                String val = s.substring(0, i+1);


BigInteger v=new BigInteger(val);
    backtrack(s, i + 1, ans, v, ds, false);
}
             else {
                String val = s.substring(idx, i + 1);



                    boolean check=true;
               BigInteger cur=new BigInteger(val);

                    if (prev.subtract(cur).toString().equals("1")) {
                        ds.add(val);
                        backtrack(s, i+1, ans, cur,ds,true);
                    }

            }

        }
    }
    public static boolean splitString(String s) {

        boolean ans[]=new boolean[1];
        ArrayList<String> ds=new ArrayList<>();
        BigInteger bg=new BigInteger("0");
backtrack(s,0,ans,bg,ds,false);
        return ans[0];
    }
}