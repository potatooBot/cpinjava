class Solution {
    public int numEquivDominoPairs(int[][] dom) {
        HashMap<ArrayList<Integer>,Integer> map=new HashMap<>();
ArrayList<ArrayList<Integer>> ds=new ArrayList<>();


for(int ele[]:dom){
    ArrayList<Integer> temp=new ArrayList<>();
    Arrays.sort(ele);
    for(int val:ele) temp.add(val);
 map.put(temp,map.getOrDefault(temp,0)+1);
}
int ans=0;
for(Map.Entry<ArrayList<Integer>,Integer> entry:map.entrySet()){
    if(entry.getValue()>=2){
        int cnt=entry.getValue();
ans = ans +(cnt*(cnt-1)/2);
    }
}
    return ans;



    }
}