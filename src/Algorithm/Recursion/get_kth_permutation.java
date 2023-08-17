package Algorithm.Recursion;
import java.util.*;
public class get_kth_permutation {
    public static void getPerm(String str,boolean flag[],ArrayList<Character> list,ArrayList<String> wrapList,int k){
        if(list.size()==str.length()){

                String ans = "";
                for (int i = 0; i < list.size(); i++) {
                    ans = ans + list.get(i);
                }

                wrapList.add(ans);

            return;
        }

        for (int i = 0; i <str.length() ; i++) {
            if(flag[i]==false) {
                list.add(str.charAt(i));
                flag[i] = true;
                getPerm(str, flag, list, wrapList,k);
                list.remove(list.size() - 1);
                flag[i] = false;
            }
        }

    }
    public static String kthPermutation(int n,int k) {
        String str="";
        for(int i=1;i<=n;i++){
            str=str+String.valueOf(i);
        }
        boolean flag[]=new boolean[str.length()];


        ArrayList<Character> list=new ArrayList<>();
    ArrayList<String> wrapList=new ArrayList<>();
        getPerm(str,flag,list,wrapList,k);

        System.out.println(wrapList);
        return wrapList.get(0);
    }
    public static void main(String[] args) {
        int N = 4, K =3;
        String ans=kthPermutation(N,K);
        System.out.println(ans);

    }
}
