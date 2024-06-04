class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
int count=0;
int odd=0;
System.out.println(map);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
if(entry.getValue()%2==0){
count=count+entry.getValue();
}
else{
odd= Math.max(odd,entry.getValue());
}
        }


        if(odd==1) return count+odd;
        if(odd==0) return count;
int val=0;
             for(Map.Entry<Character,Integer> entry:map.entrySet()){
if(entry.getValue()%2!=0){
val=val+entry.getValue()-1;
}
        }

System.out.println(count+odd+val);
  if(map.size()==1) return map.get(s.charAt(0));   
  //if(s.length()%2==0) return count+odd;
 return count+val+1;
    }
}