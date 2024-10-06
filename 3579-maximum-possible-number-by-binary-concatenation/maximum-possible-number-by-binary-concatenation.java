class Solution {
     public static void getPermu(List <List<Integer>> ans,int arr[],boolean flag[], ArrayList <Integer> list){
        if(list.size()== arr.length){


            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < arr.length ; i++) {
            if(flag[i]==false){
                list.add(arr[i]);
                flag[i]=true;
                getPermu(ans,arr,flag,list);
                flag[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
    public int maxGoodNumber(int[] nums) {
        List<List<Integer>> subset=new ArrayList<>();
        boolean vis[]=new boolean[nums.length];
        getPermu(subset,nums,vis,new ArrayList<>());

int ans=0;
for(List<Integer> ds:subset){
   String bin="";
    for(int ele:ds){
    bin=bin+Integer.toBinaryString(ele);

}
    ans=Math.max(ans,Integer.parseInt(bin,2));
}

        return ans;
    }
}