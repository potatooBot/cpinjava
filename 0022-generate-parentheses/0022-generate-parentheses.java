class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        getParen(n,ans,0,0,"");
        return ans;
    }
    
    public static void getParen(int n,List<String> ans,int open,int close,String s){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        
        if(open<n){
            getParen(n,ans,open+1,close,s+ "(");
        }
           if(close<open){
            getParen(n,ans,open,close+1,s+ ")");
        }
    }
}