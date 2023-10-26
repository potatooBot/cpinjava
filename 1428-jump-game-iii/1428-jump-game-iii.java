class Solution {
    public boolean canReach(int[] arr, int start) {
     Queue<Integer> q=new LinkedList<>();
     q.add(start);
boolean vis[]=new boolean[arr.length];
     while(!q.isEmpty()){
        int val=q.peek();
        q.remove();


if(arr[val]==0) return true;
if((val+arr[val])<arr.length&&(val+arr[val])>=0&&vis[val+arr[val]]==false){
    vis[val+arr[val]]=true;
    q.add(val+arr[val]);
}

if((val-arr[val])>=0&&(val-arr[val])<arr.length&&vis[val-arr[val]]==false){
    vis[val-arr[val]]=true;
    q.add(val-arr[val]);
}


     }
return false;
    }
}