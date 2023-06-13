class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> rowMap=new HashMap<>();
HashMap<String,Integer> colMap=new HashMap<>();

int n= grid.length;
int m= grid[0].length;
        for (int i = 0; i <n ; i++) {
            String str="";
            for (int j = 0; j <m ; j++) {
                str=str+","+String.valueOf(grid[i][j]);
            }
            rowMap.put(str, rowMap.getOrDefault(str,0)+1);
        }
        for (int i = 0; i <n ; i++) {
            String str="";
            for (int j = 0; j <m ; j++) {
                str=str+","+String.valueOf(grid[j][i]);
            }
            colMap.put(str, colMap.getOrDefault(str,0)+1);
        }
      int ans=0;
        System.out.println(rowMap);
        System.out.println(colMap);
            for (Map.Entry <String,Integer> entry: rowMap.entrySet()
                 ) {
                if(colMap.containsKey(entry.getKey())){
                    ans=ans +entry.getValue() *colMap.get(entry.getKey());
                }
            }

        return ans;
    }
}