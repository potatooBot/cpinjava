package big_integer_qes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class add_arrya_t_form_ineteger {
    public  static List<Integer> addToArrayForm(int[] num, int k) {
        String str="";
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<num.length;i++){
             str=str+String.valueOf(num[i]);
        }
        String s2=String.valueOf(k);
        BigInteger a=new BigInteger(str);
        BigInteger b=new BigInteger(s2);
BigInteger sum;
sum=a.add(b);

String res=String.valueOf(sum);


        for (int i = 0; i <res.length() ; i++) {
            list.add(res.charAt(i)-'0');
        }


        return list;
    }
    public static void main(String[] args) {
      int num[] = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
      int k =
              516;
        List<Integer> ans=new ArrayList<>();
        ans=addToArrayForm(num,k);
        System.out.println(ans);

    }
}
