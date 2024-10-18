import java.math.BigInteger;
class Solution {
    public static void backtrack(int idx,List<Integer> ds,String s,List<List<Integer>> ans){
        //System.out.println(ds);
        if(idx>=s.length()&&ds.size()>=3){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = idx;i <s.length() ; i++) {
            if (ds.size() < 2) {
                String val=s.substring(idx,i+1);
                BigInteger b1=new BigInteger(val);
                BigInteger limit=new BigInteger(String.valueOf((int)Math.pow(2,31)-1));
                if(b1.compareTo(limit)==1) return;
                if(i>idx&&val.charAt(0)=='0') return;
                ds.add(Integer.parseInt(val));
                backtrack(i+1,ds,s,ans);
                ds.remove(ds.size()-1);
            }
            else{
                String val=s.substring(idx,i+1);
                BigInteger b1=new BigInteger(val);
                BigInteger limit=new BigInteger(String.valueOf((int)Math.pow(2,31)));
                if(b1.compareTo(limit)==1) return;
                if(i>idx&&val.charAt(0)=='0') return;
                int n=ds.size();

                BigInteger a=new BigInteger(String.valueOf(ds.get(n-2)));
                BigInteger b=new BigInteger(String.valueOf(ds.get(n-1)));
                BigInteger sum=new BigInteger(String.valueOf(val));
             //   System.out.println(a.toString()+" "+b.toString()+" "+sum.toString()+" "+a.add(b).equals(sum));
                if(a.add(b).equals(sum)){
                    ds.add(Integer.parseInt(val));
                    backtrack(i+1,ds,s,ans);
                    ds.remove(ds.size()-1);
                }
            }
        }
    }
    public static List<Integer> splitIntoFibonacci(String num) {
List<Integer> ds=new ArrayList<>();
List<List<Integer>> ans=new ArrayList<>();
backtrack(0,ds,num,ans);
if(ans.size()==0)
    return new ArrayList<>();
return ans.get(0);
    }
}