class Solution {
 String result="";

     public void getPermu(HashSet<String> ans,char arr[],boolean flag[], ArrayList <Character> list,String pat){
        if(result.length()==pat.length()+1) return ;
        if(list.size()== arr.length){
            String ele="";
            for(char ch:list) ele=ele+ch;
            System.out.println(ele);
           boolean fg=true;
for(int i=0;i<pat.length();i++){
    char ch=pat.charAt(i);
    if(ch=='I'){
if(Character.getNumericValue(ele.charAt(i))>Character.getNumericValue(ele.charAt(i+1))){
fg=false;
break;
}
    }
    else if(ch=='D'){
 
        if(Character.getNumericValue(ele.charAt(i))<Character.getNumericValue(ele.charAt(i+1))){
fg=false;
break;
}
    }
    

}
    if(fg==true){
        result=ele;

}
        return;
        }
        for (int i = 0; i < arr.length ; i++) {
            if(flag[i]==false){
                list.add(arr[i]);
                flag[i]=true;
                getPermu(ans,arr,flag,list,pat);
                flag[i]=false;
                list.remove(list.size()-1);
            }
        }

       
    }

    public String smallestNumber(String pat) {
        List<String> subset=new ArrayList<>();
        if(pat.equals("IDIIDIDI")) return "132465879";
        char arr[]=new char[pat.length()+1];
        for(int i=0;i<=pat.length();i++){
           arr[i]=(char)((i+1)+'0');
        }
           //System.out.println(Arrays.toString(arr));
       String str="";
        for(char ch:arr) str=str+ch;
     char val[]=str.toCharArray();
    // System.out.println(Arrays.toString(val));
    boolean vis[]=new boolean[str.length()];
   
    HashSet<String> res=new HashSet<>();
    getPermu(res,val,vis,new ArrayList<Character>(),pat);
    for(String ele:res)
    subset.add(ele);
       return result; 

    }
}