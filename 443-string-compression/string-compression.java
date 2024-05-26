class Solution {
    public int compress(char[] chars) {
if(chars.length==1) return 1;
String word="";
for(char ch:chars) word =word+ch;

         int i=0;int j=0;
String ans="";
        while(i<word.length()){
int cnt=0;
char c=word.charAt(i);
j=i;
while(j<word.length()&&word.charAt(j)==c){
cnt++;
j++;
}
if(cnt>1)
ans=ans+c+String.valueOf(cnt);
else{
ans=ans+c;    
}
cnt=0;
i=j;
        }

        //System.out.println(ans);
i=0;
        for(i=0;i<ans.length();i++){
chars[i]=ans.charAt(i);
        }
        return ans.length();
    }
}