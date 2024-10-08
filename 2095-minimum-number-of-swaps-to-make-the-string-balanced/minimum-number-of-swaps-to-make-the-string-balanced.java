class Solution {
    public int minSwaps(String s) {
    int cnt=0;
Stack<Character> stk=new Stack<>();
int close=0;
for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    if(!stk.isEmpty()&&ch==']'&&stk.peek()=='['){
        stk.pop();
        continue;
    }
     if(ch=='['){
        stk.push(ch);
       

    }
     if(ch==']'){
        //stk.push(ch);
close++;

    }

}

 //System.out.println(stk+" "+close);

 while(close>0){
    close=close-2;
    cnt++;
 }
return cnt;

    }
}