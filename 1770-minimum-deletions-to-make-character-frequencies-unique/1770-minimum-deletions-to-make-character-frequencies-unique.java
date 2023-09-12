class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
for(int i=0;i<s.length();i++){
    map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
}
ArrayList<Integer> ds=new ArrayList<>();

map.forEach((key,value)->ds.add(value));
HashSet<Integer> set=new HashSet<>();
int cnt=0;

Collections.sort(ds);
System.out.println(ds);
for(int ele:ds){
if(set.contains(ele)){

while(set.contains(ele)==true&&ele!=0){
ele=ele-1;
cnt++;
}
}
set.add(ele);
}

return cnt;
    }
}