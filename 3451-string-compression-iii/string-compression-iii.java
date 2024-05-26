class Solution {
    public String compressedString(String word) {
        int i=0;int j=0;
String ans="";
        while(i<word.length()){
int cnt=0;
char c=word.charAt(i);
j=i;
while(j<word.length()&&word.charAt(j)==c){
cnt++;

if(cnt==9){
    j++;
break;
}
j++;
}
ans=ans+String.valueOf(cnt)+c;
cnt=0;
i=j;
        }

        
        return ans;
    }
}