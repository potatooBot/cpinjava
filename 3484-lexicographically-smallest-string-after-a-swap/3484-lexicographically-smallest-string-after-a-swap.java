class Solution {
    public String getSmallestString(String s) {
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++) arr[i]=s.charAt(i);
    for(int i=0;i<s.length()-1;i++){
        if((Character.getNumericValue(arr[i])%2==0&&Character.getNumericValue(arr[i+1])%2==0)&&Character.getNumericValue(arr[i])>Character.getNumericValue(arr[i+1])){
            char temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            break;
        }
        else if((Character.getNumericValue(arr[i])%2==1&&Character.getNumericValue(arr[i+1])%2==1)&&Character.getNumericValue(arr[i])>Character.getNumericValue(arr[i+1])){
             char temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            break;
        }
    }
    String ans="";
    for(char ch:arr) ans=ans+ch;

    return ans;
    }
}