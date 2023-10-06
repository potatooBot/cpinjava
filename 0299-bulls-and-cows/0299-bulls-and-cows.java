class Solution {
    public String getHint(String s, String g) {
       int n1=s.length();
       int n2=g.length();
int bulls=0;

        char ch1[]=s.toCharArray();
char ch2[]=g.toCharArray();
for(int i=0;i<n1;i++){
    if(s.charAt(i)==g.charAt(i)){
ch1[i]='*';
ch2[i]='-';
bulls++;
    }
}
HashMap<Character,Integer> map1=new HashMap<>();
HashMap<Character,Integer> map2=new HashMap<>();
for(int i=0;i<n1;i++){
if(ch1[i]=='*'||ch2[i]=='-') continue;
     map1.put(ch1[i],map1.getOrDefault(ch1[i],0)+1);
    map2.put(ch2[i],map2.getOrDefault(ch2[i],0)+1);
}
int cnt=0;
//System.out.println(map1);
//System.out.println(map2);
for(Map.Entry<Character,Integer> entry:map1.entrySet()){
if(map2.get(entry.getKey())!=null){
if(entry.getValue()<map2.get(entry.getKey())){
    cnt=cnt+entry.getValue();
}
else if(entry.getValue()>map2.get(entry.getKey())){
    cnt=cnt+map2.get(entry.getKey());
}
else if(entry.getValue()==map2.get(entry.getKey())) {
    cnt=cnt+entry.getValue();
}
}
}
return bulls+ "A"+cnt+"B";
    }
}