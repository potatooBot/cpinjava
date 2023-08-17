package STRINGS_Pract.Binary_Substring;

import java.util.Arrays;
import java.util.HashMap;

public class binary_substring {
    public static int binarySubstring(int a, String str)
    {
StringBuilder sb=new StringBuilder(str);
sb=sb.reverse();

//        HashMap<Integer,Integer> map=new HashMap<>();
//
//
//        int val= Integer.parseInt(sb.toString());
//int arr[]=new int[str.length()];
//int num=val;
//int idx=0;
//while (num!=0){
//int rem=num%10;
//arr[idx]=rem;
//num=num/10;
//idx++;
//}

//int sum=0;
//map.put(0,1);
//int count=0;
//for(int i=0;i<arr.length;i++){
//    sum=sum+arr[i];
//    int remain=sum-3;
//    if(map.containsKey(remain)){
//        count=count+map.get(remain);
//
//    }
//
//    map.put(sum,map.getOrDefault(sum,0)+1);
//}
        int count=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                continue;
            }

            for (int j = i+1; j <str.length() ; j++) {
if(str.charAt(j)=='1'){
    count++;
}

            }
        }
     return count;

}

    public static void main(String[] args) {
        int N = 5;
        String str = "01101";
        int ans=binarySubstring(N,str);
        System.out.println(ans);
    }


}
