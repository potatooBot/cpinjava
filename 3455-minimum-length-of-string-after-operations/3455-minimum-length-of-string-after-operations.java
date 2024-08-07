class Solution {
    public int minimumLength(String s) {
      HashMap<Character,Integer> map=new HashMap<>();
      for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
      }
      int ans=0;
      for(Map.Entry<Character,Integer> entry:map.entrySet()){
        if(entry.getValue()==1||entry.getValue()==2) 
        {
          //  ans=ans+entry.getValue();
        continue;
        }
if(entry.getValue()%2==0) ans=ans+entry.getValue()-2;
else{
    ans=ans+entry.getValue()-1;
}
      }
System.out.println(map+" "+ans);
return s.length()-ans;
    }
}