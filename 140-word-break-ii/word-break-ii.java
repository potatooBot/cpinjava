class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String > dp[]=new ArrayList[s.length()+1];
List<String> ini=new ArrayList<>();

ini.add("");
dp[0]=ini;
for(int i=1;i<=s.length();i++){
    List<String> ds=new ArrayList<>();

    for(int j=0;j<i;j++){

        if(dp[j].size()>0&&wordDict.contains(s.substring(j,i))){
        for(String ele:dp[j]){
    ds.add(ele+ (ele.equals("")?"":" ")+s.substring(j,i));
        }
    }
    }

    dp[i]=ds;
}
return dp[s.length()];
    }
}