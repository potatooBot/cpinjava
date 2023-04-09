class Solution {
    public int removeDuplicates(int[] nums) {
            TreeMap<Integer,Integer> map=new TreeMap<>();

        for (int i = 0; i < nums.length ; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1 );
        }

int i=0;
        int count=0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()
             ) {
if (entry.getValue()==1){
    nums[i++]=(int) entry.getKey();
count++;
}
else if(entry.getValue()>=2) {
    nums[i++]=entry.getKey();
    nums[i++]=entry.getKey();
count=count+2;
}
        }

        return count;
    }
}