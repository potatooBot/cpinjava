class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
                ArrayList<Integer> neg=new ArrayList<>();
                for(int ele:nums){
                    if(ele<0) neg.add(ele)
;
if(ele>0) pos.add(ele);
               }


int ans[]=new int[nums.length];
int idx=0;
for(int i=0;i<pos.size();i++){
ans[idx]=pos.get(i);
idx++;
ans[idx]=neg.get(i);
idx++;
}

return ans;
    }
}