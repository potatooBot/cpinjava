class Solution {
     public static void backtrack(int idx,ArrayList<String> ds,int ans[],String s){

        if(idx>=s.length()){
            ans[0]=Math.max(ans[0],ds.size());
            return;
        }

        for (int i = idx; i <s.length() ; i++) {
            String sub=s.substring(idx,i+1);
            if(ds.contains(sub)==false){
                ds.add(sub);
                backtrack(i+1,ds,ans,s);
            ds.remove(ds.size()-1);
            }
        }
    }
    public static int maxUniqueSplit(String s) {
ArrayList<String> ds=new ArrayList<>();
int ans[]=new int[1];
backtrack(0,ds,ans,s);
return  ans[0];
    }
}