class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         List<Boolean> ans=new ArrayList<>();
   List<Integer> can=new ArrayList<>();

        for (int i = 0; i <candies.length ; i++){
            can.add(candies[i]);

        }
        int max=Collections.max(can);

        for (int i = 0; i <candies.length ; i++) {
if(can.get(i)+extraCandies>=max) ans.add(true);
else ans.add(false);
        }
        System.out.println(ans);

        return ans;

    }
}