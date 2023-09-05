class Solution {
    public int largestRectangleArea(int[] arr) {
               Stack <Integer> stk=new Stack<>();
        int n=arr.length;

        int left[]=new int[n+1];
        int right[]=new int[n+1];


        for(int i=0;i<n;i++){

while(!stk.isEmpty()&&arr[stk.peek()]>=arr[i]){
    stk.pop();
}

if(stk.isEmpty()){
    left[i]=0;
}
else{
    left[i]=stk.peek()+1;;
}
stk.push(i);

        }


        stk.clear();


        for(int i=n-1;i>=0;i--){
while(!stk.isEmpty()&&arr[stk.peek()]>=arr[i]){
    stk.pop();
}
if(stk.isEmpty()){
    right[i]=n-1;
}
else{
    right[i]=stk.peek()-1;
}
stk.push(i);
        }

int maxA=0;
for(int i=0;i<n;i++){
    maxA=Math.max(maxA,(right[i]-left[i]+1)*arr[i]);
}


return maxA;
    }
}