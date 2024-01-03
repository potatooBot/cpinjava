class Solution {
    public int numberOfBeams(String[] bank) {
        int len=bank.length;
    ArrayList<Integer> ds=new ArrayList<>();
        int sum=0;
    int prev=0;
        for(int i=0;i<len;i++){
            int n=bank[i].length();
            int cnt=0;
            for(int j=0;j<n;j++){
if(bank[i].charAt(j)=='1'){
    cnt++;
}
            }
//System.out.println(sum+" "+prev+" "+cnt);
if(cnt>0){
sum=sum+cnt*prev;
prev=cnt;
}
        }

        return sum;
    }
}