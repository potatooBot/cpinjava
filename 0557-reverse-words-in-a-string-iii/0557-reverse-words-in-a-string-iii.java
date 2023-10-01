class Solution {
    public String reverseWords(String s) {
        String str[]=s.split(" ");
        String ans="";
       // System.out.println(Arrays.toString(str));
        for(int i=0;i<str.length;i++){
String val=str[i];
for(int j=val.length()-1;j>=0;j--){
ans=ans+val.charAt(j);
        }
        if(i!=str.length-1)
        ans=ans +" ";
        }
        return ans;
    }
}