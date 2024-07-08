class Solution {
    public static void generate(int n,String ele,int idx,List<String> ans,String str){
    if(str.length()>=n){
ans.add(str);
return ;
    }

    if(idx<n){
if(str.charAt(idx)=='1'){
    generate(n,ele,idx+1,ans,str+"0");
    generate(n,ele,idx+1,ans,str+"1");
}
else{
    generate(n,ele,idx+1,ans,str+"1");
}

    }

    }
    public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<>();
    String ele="";
//System.out.println(ele);
  /*  for(int i=0;i<n;i++){
        ele=ele+"1";
    }*/
    generate(n,ele,0,ans,"1");
    generate(n,ele,0,ans,"0");
        return ans;
    }
}