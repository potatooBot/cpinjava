class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> set=new HashSet<>();

        int num=n;
        while(num!=1){
int val=num;
ArrayList<Integer> ds=new ArrayList<>();
int sum=0;
while(val!=0){
ds.add(val%10);
val=val/10;
}

for(int i=0;i<ds.size();i++){
sum=sum+(int)Math.pow(ds.get(i),2);
}
        if((sum==1)) return true;
if(set.contains(sum)) return false;
num=sum;
set.add(sum);
        }
return true;
    }
}