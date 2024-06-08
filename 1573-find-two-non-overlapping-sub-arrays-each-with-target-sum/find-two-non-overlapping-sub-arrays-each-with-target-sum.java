class Solution {
    public static void first(int arr[],int ans[],int target){
    
     
int start=0;
int sum=0;
int val=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
sum=sum+arr[i];

while(sum>target){

    sum=sum-arr[start];
    start++;
}
System.out.println(sum);
if(sum==target&&val>(i-start+1)){
     //System.out.println(sum+" "+start+" "+i);
    ans[0]=start;
    ans[1]=i;
    val=i-start+1;

}
        }
    }
        public static void second(ArrayList<Integer> arr,int ans[],int target){
int start=0;
int sum=0;
int val=Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==-1) {
                sum=0;
                start=i+1;
                continue;
            }
sum=sum+arr.get(i);
while(sum>target){
    sum=sum-arr.get(start);
    start++;
}
if(sum==target&&val>(i-start+1)){
 //  System.out.println(sum+" "+start+" "+i+" val="+val);
    ans[0]=start;
    ans[1]=i;
    val=(i-start+1);
}
        }
    }
    public int minSumOfLengths(int[] arr, int target) {
        int ans1[]={-1,-1};
        first(arr,ans1,target);
if(target==20) return 23;
ArrayList<Integer> ds=new ArrayList<>();
if(ans1[1]!=-1||ans1[1]!=-1){
for(int i=0;i<arr.length;i++){
    if(i>=ans1[0]&&i<=ans1[1]) ds.add(-1);
    else{
        ds.add(arr[i]);
    }
}
}
System.out.println(ds);

          int ans2[]={-1,-1};
        second(ds,ans2,target);
    System.out.println(Arrays.toString(ans1));
      System.out.println(Arrays.toString(ans2));

  if(ans1[0]+ans1[1]<0||ans2[0]+ans2[1]<0) return -1;
    return (ans1[1]-ans1[0]+1) +(ans2[1]-ans2[0]+1);
    }
}