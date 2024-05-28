class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
    /*    int i=0;
int val=0;
int ans=0;
int cnt=0;
boolean flag=true;
        while(i<s.length()){
if(val + Math.abs((int)s.charAt(i)-(int)t.charAt(i))<=maxCost){
cnt++;
flag=false;
val=val+ Math.abs((int)s.charAt(i)-(int)t.charAt(i));
}
else if(Math.abs((int)s.charAt(i)-(int)t.charAt(i))<=maxCost){
    cnt=1;
    val= Math.abs((int)s.charAt(i)-(int)t.charAt(i));
}
else{
    cnt=0;
    val=0;
}
System.out.println(val);
ans=Math.max(ans,cnt);
i++;
        }
if(flag==true) return 0;
        return ans;*/


        //int end=0;
        int start=0;
        int cnt=0;
        int ans=0;
        int val=0;
    for(int end=0;end<s.length();end++){
        val=val+ Math.abs((int)s.charAt(end)-(int)t.charAt(end));
        cnt++;
        while(val>maxCost){
            val=val- Math.abs((int)s.charAt(start)-(int)t.charAt(start));
        start++;
        cnt--;
        }
ans=Math.max(ans,cnt);
    }

    return ans;
    }
}