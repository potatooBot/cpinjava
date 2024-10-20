class Solution {
    public int minimumPushes(String word) {
     HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        String arr[]=new String[8];
        Arrays.fill(arr,"");
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((entry1,entry2)-> entry2.getValue().compareTo(entry1.getValue()));
        LinkedHashMap<Character,Integer> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> entry:list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        int cnt=0;
        for (Map.Entry<Character,Integer> entry:sortedMap.entrySet()){

if(arr[cnt].equals("")){
    arr[cnt]=String.valueOf(entry.getKey());
}
else {
    String val=arr[cnt];
    
    val=val+entry.getKey();
    arr[cnt]=val;
}
cnt++;
if(cnt==8) cnt=0;

        }
        int ans=0;
       
    for (Map.Entry<Character,Integer> entry:sortedMap.entrySet()){
        String ele=String.valueOf(entry.getKey());
        for (int i = 0; i <8 ; i++) {
            int idx=arr[i].indexOf(ele);
            if(idx!=-1){
                ans=ans+entry.getValue()*(idx+1);
                //System.out.println(ele+" "+ans);
            }
        }
    }
        return ans;  
    }
}