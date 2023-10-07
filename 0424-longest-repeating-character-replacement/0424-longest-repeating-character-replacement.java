class Solution {
    public static int subst(List<Character> ds,int k,char ch){
int chcnt=0;
int start=0;
int ans=0;
for(int end=0;end<ds.size();end++){
    if(ds.get(end)!=ch){
                chcnt++;
    }

    while(chcnt>k){
       //  System.out.println(chcnt);
        if(ds.get(start)!=ch){
            chcnt--;
        }
        start++;
    }
    ans=Math.max(ans,end-start+1);
}

return ans;
    }
    
    public int characterReplacement(String s, int k) {
    List<Character> ds1=new ArrayList<>();
    List<Character> ds2=new ArrayList<>();
int  n=s.length();
TreeSet<Character> set=new TreeSet<>();
for(int i=0;i<n;i++){
    ds1.add(s.charAt(i));
    set.add(s.charAt(i));
}
int ans=0;
//System.out.println(set);
for(char ele:set){
//System.out.println(ds1);
ans=Math.max(subst(ds1,k,ele),ans);
}
return ans; 
    }
}