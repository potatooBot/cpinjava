class Solution {
    public String decodeString(String s) {
        Stack<Integer> stk=new Stack<>();
        Stack<String> res=new Stack<>();
int num=0;
String decode="";
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
if(Character.isDigit(ch)){
    num= 10*num +Character.getNumericValue(ch);
}
else if(ch=='['){
    stk.push(num);
    num=0;
    res.push(decode);
    decode="";
}
else if(ch==']'){
    String tmp=decode;
    decode=res.pop();
    for(int j=stk.pop();j>0;j--){
        decode=decode+tmp;
    }
}
else{
    decode=decode +ch;
}

}

return decode;
    }
}