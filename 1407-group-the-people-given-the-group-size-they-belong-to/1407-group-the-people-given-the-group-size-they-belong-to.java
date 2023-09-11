class Solution {
    public List<List<Integer>> groupThePeople(int[] group) {
        List<List<Integer>> ans=new ArrayList<>();
        //Arrays.sort(group);
int n=group.length;
TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
for(int i=0;i<n;i++){
    if(map.get(group[i])==null)
    map.put(group[i],new ArrayList<Integer>());


    map.get(group[i]).add(i);
}
System.out.println(map);

for(Map.Entry<Integer,ArrayList<Integer>> entry:map.entrySet()){

int val=entry.getValue().size()/entry.getKey();
int idx=0;
ArrayList<Integer> ds=entry.getValue();

for(int i=0;i<val;i++){
ans.add(new ArrayList<>());
for(int j=0;j<entry.getKey();j++){
    System.out.println(ds.get(idx));
ans.get(ans.size()-1).add(ds.get(idx));
idx++;
}

}



    }
    return ans;

    }
}