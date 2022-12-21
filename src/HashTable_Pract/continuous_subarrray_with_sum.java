package HashTable_Pract;

import java.util.HashSet;

public class continuous_subarrray_with_sum {
    public static boolean checkSubarraySum(int[] arr, int k) {
        if(arr.length==1||arr.length==0) return false;
        int sum=0;
        HashSet <Integer> set=new HashSet<>();
        int pre[]=new int[arr.length];
        pre[0] = arr[0];
        // Adding present element with previous element
        for (int i = 1; i < arr.length; ++i)
            pre[i] = pre[i - 1] + arr[i];

//for(int i=0;i<arr.length;i++){
//    sum=arr[i];
//    for(int j=i+1;j<arr.length;j++){
//sum=sum+arr[j];
//        if(!set.contains(sum)){
//            System.out.println("sum becomes "+sum);
//if(sum%k==0||sum==0) {
//    System.out.println("true for " + sum);
//    return true;
//}
//}
//   set.add(sum);
//    }
//    sum=0;
//    System.out.println("sum becomes zero "+sum);
//}

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(pre[i]);
        };
return false;
    }
    public static void main(String[] args) {
int arr[]={5,0,0,0,0};
int k=2;
boolean check=checkSubarraySum(arr,k);
        System.out.println(check);
    }
}
