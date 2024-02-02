class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String str="123456789";

List<Integer> ans=new ArrayList<>();
int start=0;

        for(int i=0;i<str.length();i++){
        for(int j=i+1;j<str.length()+1;j++){
int val=Integer.valueOf(str.substring(i,j));
if(val>=low&&val<=high)
ans.add(val);
        }
        }
Collections.sort(ans);
 return ans;
    }
}