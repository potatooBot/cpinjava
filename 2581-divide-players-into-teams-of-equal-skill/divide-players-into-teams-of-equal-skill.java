class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int low=0;
        int high=skill.length-1;
        int val=skill[high] + skill[low];
long sum=0;

        while(low<high){
            if(skill[high]+skill[low]!=val){
                return -1;
            }
            else{
                sum=sum +   skill[high] *skill[low];
                low++;
                high--;
            }
        }


        return sum;
    }
}