class Solution {
    public int nextBeautifulNumber(int n) {
        for(int i=n+1;i<=100000000;i++ ){
            boolean flag=true;
String val=String.valueOf(i);
HashMap<Integer,Integer> map=new HashMap<>();
for(char ch:val.toCharArray()){
int num=Character.getNumericValue(ch);
if(num>val.length()) {
flag=false;
break;
}
map.put(num,map.getOrDefault(num,0)+1);

}
if(flag==false) continue;
for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    if(entry.getKey()!=entry.getValue()){
        flag=false;
    }
}
if(flag) return i;


        }

        return n;
    }
}