class Solution {
    public String convertDateToBinary(String date) {
        String arr[]=date.split("\\-");
        String ans="";
for(String ele:arr){
int val=Integer.parseInt(ele);
String s=Integer.toBinaryString(val)+"-";
ans=ans+s;
}
return ans.substring(0,ans.length()-1);
    }
}