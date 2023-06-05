class Solution {
    public int[][] merge(int[][] inval) {
        Arrays.sort(inval,(a,b)->Integer.compare(a[0],b[0]));
int idx=0;
ArrayList<ArrayList<Integer>> interval=new ArrayList<>();

        for (int i = 0; i <inval.length ; i++) {
            interval.add(new ArrayList<>());
        }
        for (int i = 0; i <inval.length ; i++) {
            for (int it:
                 inval[i]) {
                interval.get(i).add(it);
            }
        }
        System.out.println(interval);
        for (int i = 0; i <interval.size()-1 ; i++) {
            if(interval.get(i).get(1)>=interval.get(i+1).get(0)){
                if(interval.get(i+1).get(1)>interval.get(i).get(1)) {
                    interval.get(i).set(1, interval.get(i + 1).get(1));
                    interval.remove(i + 1);
                }
                else {
                    interval.get(i).set(1, interval.get(i).get(1));
                    interval.remove(i + 1);
                }
                i--;
            }
        }
        int ans[][]=new int[interval.size()][2];
        for (int i = 0; i <interval.size() ; i++) {

                ans[i][0]=interval.get(i).get(0);
                ans[i][1]=interval.get(i).get(1);

        }
return ans;
    }
}