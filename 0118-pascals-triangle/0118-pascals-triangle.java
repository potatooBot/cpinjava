class Solution {
    public List<List<Integer>> generate(int rows) {
     List<Integer> ds=new ArrayList<>();

     List<List<Integer>> ans=new ArrayList<>(); 

ds.add(1);
ans.add(new ArrayList<>(ds));
for(int i=1;i<rows;i++){
List<Integer> prev=ans.get(i-1);
System.out.println(ans.get(i-1));
List<Integer> list=new ArrayList<>();
list.add(1);
for(int j=0;j<prev.size()-1;j++){
list.add(prev.get(j)+prev.get(j+1));
}
list.add(1);
ans.add(new ArrayList<>(list));
}

return ans;
    }
}