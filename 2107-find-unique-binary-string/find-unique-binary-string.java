class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums[0].length();
ArrayList<String> arr=new ArrayList<>();
for(String ele:nums)
arr.add(ele);

        for(int i=0;i<(int)Math.pow(2,n);i++){
            String bin=Integer.toBinaryString(i);
        String zero="";
        for(int j=1;j<=(n-bin.length());j++){
            zero=zero+"0";
        }
        bin=zero+bin;
        if(arr.contains(bin)==false) return bin;
        }

        return "-1";
    }
}