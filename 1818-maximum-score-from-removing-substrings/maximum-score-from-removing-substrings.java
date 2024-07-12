class Solution {
    public static int firstOp(char arr[],Stack<Character> stk,int x){
    
    int ans=0;
  
      
            for(int i=0;i<arr.length;i++){
if(stk.isEmpty()==false&&arr[i]=='b'&&stk.peek()=='a'){
stk.pop();
ans=ans+x;
}
else{
    stk.push(arr[i]);
}


    }
    return ans;
    }

        public static int secondOp(char arr[],Stack<Character> stk,int y){
    
    int ans=0;
  
      
            for(int i=0;i<arr.length;i++){
if(stk.isEmpty()==false&&arr[i]=='a'&&stk.peek()=='b'){
stk.pop();
ans=ans+y;
}
else{
    stk.push(arr[i]);
}


    }
    return ans;
    }
    public int maximumGain(String s, int x, int y) {
   
int ans=0;
char arr[]=new char[s.length()];

for(int i=0;i<s.length();i++){
    arr[i]=s.charAt(i);
}
if(x>=y){
     Stack<Character> stk=new Stack<>();
     ans=ans+firstOp(arr,stk,x);
char arr2[]=new char[stk.size()];
for(int i=0;i<stk.size();i++) arr2[i]=stk.get(i);
stk.clear();
ans=ans+secondOp(arr2,stk,y);
}
else{
 Stack<Character> stk=new Stack<>();
     ans=ans+secondOp(arr,stk,y);
char arr2[]=new char[stk.size()];
for(int i=0;i<stk.size();i++) arr2[i]=stk.get(i);
stk.clear();
ans=ans+firstOp(arr2,stk,x);
}
        

        

return ans;
    }
}