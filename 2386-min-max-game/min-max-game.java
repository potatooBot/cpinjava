class Solution {
    public int minMaxGame(int[] nums) {
        int iter=0;
        int ans=-1;
        if(nums.length==1) return nums[0];

    ArrayList<Integer> ds=new ArrayList<>();
   for(int ele:nums) ds.add(ele);
System.out.println(ds);
    while(ds.size()!=1){
boolean flag=true;
for(int i=0;i<ds.size()-1;i=i++){
if(flag==true){

    if(ds.get(i)<ds.get(i+1)){
  
        ds.remove(i+1);
    }
    else{
        ds.remove(i);
    }
flag=false;

}

else {
      if(ds.get(i)<ds.get(i+1)){
        ds.remove(i);
    }
    else{
        ds.remove(i+1);
    }


    if(ds.size()==2){
    return Math.min(ds.get(0),ds.get(1));
}
flag=true;
}
i++;

}
System.out.println(ds);
    }
    return ds.get(0);
    }
}