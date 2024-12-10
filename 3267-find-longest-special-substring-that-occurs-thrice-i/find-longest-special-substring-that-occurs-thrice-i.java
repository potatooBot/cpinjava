class Solution {
    public int maximumLength(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
boolean flag=false;
for(Map.Entry<Character,Integer> entry:map.entrySet())
{
    if(entry.getValue()>=3) flag=true;

}
if(flag==false) return -1;

int maxi=-1;


for(int i=0;i<s.length();i++){
    for(int j=i;j<s.length();j++){
        String sub=s.substring(i,j+1);
    HashSet<Character> set=new HashSet<>();
    for(char ch:sub.toCharArray()){
        set.add(ch);
    }
    //System.out.println("sub ="+sub);
    if(set.size()>1) break;
    else{
        int cnt=0;
        for(int k=0;k<s.length();k++){
int len=sub.length();
if(k+len<=s.length()){
String val=s.substring(k,k+len);
// System.out.println("Val= "+val);
if(val.equals(sub))
{
    cnt++;
}
}

        }
        if(cnt>=3){
            ///System.out.println("Ans= "+sub);
            maxi=Math.max(maxi,sub.length());
        }
    }
    
    
    }
}
return maxi;
    }
}