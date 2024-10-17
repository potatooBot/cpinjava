class Solution {
    public void backtrack(String s,int idx,int dots,String cur,List<String> ans){
        if(dots>4) return;
        if(dots==4&&idx==s.length()){
            ans.add(cur.substring(0,cur.length()-1));
            return ;
        }
        for(int i=1;i<=3;i++){
            if(idx+i>s.length()) return;
            String val=s.substring(idx,idx+i);
            if(i>1&&val.charAt(0)=='0') return;
            if(Integer.parseInt(val)>255) return;
            backtrack(s,idx+i,dots+1,cur+val+".",ans);
        }
    }
    
    public List<String> restoreIpAddresses(String s) {
        List<String> ans=new ArrayList<>();
        backtrack(s,0,0,"",ans);
        return ans;
    }
}