class Solution {
    public List<String> stringSequence(String tar) {
        StringBuilder cur=new StringBuilder("");
        int idx=0;
        List <String> ans=new ArrayList<>(); 
        while(idx!=tar.length()){

for(char ch='a';ch<='z';ch++){
        cur.append(ch);
ans.add(cur.toString());
    if(ch==tar.charAt(idx)){
        idx++;
    break;
    }
    cur.setLength(cur.length()-1);

}

        }
        return ans;
    }
}