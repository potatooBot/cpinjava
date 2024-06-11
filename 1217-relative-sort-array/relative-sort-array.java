class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
ArrayList<Integer> ds1=new ArrayList<>();
ArrayList<Integer> ds2=new ArrayList<>();
    for(int ele:arr1) 
    {
    map.put(ele,map.getOrDefault(ele,0)+1);
    ds1.add(ele);
    }
        for(int ele:arr2) 
    {
    ds2.add(ele);
    }

  TreeMap<Integer,Integer>  map2=new TreeMap<>();
    for(int ele:arr1){
if(ds2.contains(ele)==false){
    map2.put(ele,map2.getOrDefault(ele,0)+1);
}
    }
//System.out.println(map2);
int i=0;
    for(int ele:arr2){
int cnt=map.get(ele);
while(cnt!=0){
    arr1[i]=ele;
    cnt--;
i++;
}
    }

    for(Map.Entry<Integer,Integer> entry:map2.entrySet()){
int val=entry.getKey();
int cnt=entry.getValue();

while(cnt!=0){
    arr1[i]=val;
    cnt--;
    i++;
}


    }
    return arr1; 
    }
}