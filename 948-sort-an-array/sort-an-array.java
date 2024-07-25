class Solution {
    public int[] sortArray(int[] nums) {
     PriorityQueue <Integer> minHeap=new PriorityQueue<>();

    for(int i=0;i<nums.length;i++){
minHeap.add(nums[i]);
    }
    int res[]=new int[nums.length];
    int j=0;
while(!minHeap.isEmpty())
{
res[j++]=minHeap.poll();
}

    return res;
    }
}