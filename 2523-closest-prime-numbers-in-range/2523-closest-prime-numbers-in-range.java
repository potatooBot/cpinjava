class Solution {
    public int[] closestPrimes(int left, int right) {
   
int ans[]=new int[2];
boolean prime[]=new boolean[right+2];
        Arrays.fill(prime,true);
        for (int i = 2; i*i <=right ; i++) {
if(prime[i]==true) {
    for (int j = i * i; j <= right; j = j + i) {
prime[j]=false;
    }
}

        }
      ArrayList<Integer> list=new ArrayList<>();
        int mini=Integer.MAX_VALUE;
        for (int i = left; i <=right ; i++) {
            if(prime[i]==true){
             list.add(i);
            }
        }

        ans[0]=ans[1]=-1;
if(list.size()<=1) {
    return ans;
}
//if(list.get(0)==1){
//    list.remove(0);
//}
      list.remove(Integer.valueOf(1));
     // System.out.println(list);
      for (int i = 1; i < list.size() ; i++) {
          if(mini>list.get(i)-list.get(i-1)){
              ans[0]=list.get(i-1);
              ans[1]=list.get(i);
              mini=list.get(i)-list.get(i-1);
          }
      }
return ans; 
    }
}