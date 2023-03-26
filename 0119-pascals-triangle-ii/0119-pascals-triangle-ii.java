class Solution {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
     ans.add(new ArrayList<>());
     ans.get(0).add(1);
     for (int rows = 1; rows <numRows+1 ; rows++) {
         List<Integer> rowArr=new ArrayList<>();
         List<Integer> prevRow=new ArrayList<>(ans.get(rows-1));
     rowArr.add(1);

         for (int j = 1; j <rows ; j++) {
             rowArr.add(prevRow.get(j-1)+prevRow.get(j));
         }
         rowArr.add(1);
                ans.add(new ArrayList<>(rowArr));

     }
        System.out.println(ans);
     return ans.get(ans.size()-1);
    }
}