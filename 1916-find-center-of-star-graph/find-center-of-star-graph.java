class Solution {
    public int findCenter(int[][] edges) {
       int maxi=-1;
        for(int arr[]:edges){
            maxi=Math.max(maxi,arr[0]);
               maxi=Math.max(maxi,arr[1]);
        }

        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();

        for(int i=1;i<=maxi+1;i++){
            adj.add(new ArrayList<>());
        } 

        for(int arr[]:edges){
            adj.get(arr[0]).add(arr[1]);
            adj.get(arr[1]).add(arr[0]);
        }

        for(int i=1;i<=maxi;i++){
            if(adj.get(i).size()==maxi-1){
                return i;
            }
        }
        return -1;
    }
}