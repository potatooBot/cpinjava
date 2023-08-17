package GFG_Daily.String_Permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class String_PErmutation {
    public static void getPerm(String str,ArrayList<String> list,ArrayList<Character> ds,boolean flag[]){

        if(ds.size()==str.length()){
            String val="";

            for (char ch : ds) {
                val=val+ch;
            }
            list.add(val);
            return;
        }

        for (int i = 0; i <str.length() ; i++) {
            if (flag[i] == false) {
                flag[i]=true;
                ds.add(str.charAt(i));
                getPerm(str,list,ds,flag);
                flag[i]=false;
                ds.remove(ds.size()-1);
            }
        }


    }
    static  public ArrayList<String> permutation(String str)
    {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<Character> ds=new ArrayList<>();
        boolean flag[]=new boolean[str.length()+1];
        getPerm(str,list,ds,flag);
        Collections.sort(list);
     return list;
     //Your code here
    }
    public static void main(String[] args) {
        String S = "ABSG";
        ArrayList<String > ans=permutation(S);
        System.out.println(ans);

    }


}
