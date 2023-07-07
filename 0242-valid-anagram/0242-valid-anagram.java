class Solution {
    public boolean isAnagram(String s, String t) {
           char [] first=s.toCharArray();
        char [] tstr=t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(tstr);
       String sorted1=new String(first);
       String sorted2=new String(tstr);
        if(sorted1.equals(sorted2)){
        return true;
        }
        else {
          return false;
        }
    }
}