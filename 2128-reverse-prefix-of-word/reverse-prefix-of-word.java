class Solution {
    public String reversePrefix(String word, char ch) {
        String ans="";
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c==ch){
                StringBuilder sb=new StringBuilder(word.substring(0,i+1));
                ans=sb.reverse().toString()+word.substring(i+1);
            break;
            }

        }


        if(ans.length()==0) return word;
        return ans;
    }
}