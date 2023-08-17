package Algorithm.SDE_QUESTIONS.Add_two_numbers_as_Array;

import java.util.ArrayList;
import java.util.Collections;

public class add_two_numbs_as_array {
    static   String calc_Sum(int arr1[], int n, int arr2[], int m)
    {

int i=n-1;
int j=m-1;
int carry=0;
        ArrayList<Integer> temp=new ArrayList<>();
while (i>=0||j>=0||carry==1) {
    int sum=0;
if(i >= 0) {
        sum = sum + arr1[i];
        i--;
    }
    if (j >= 0) {
        sum = sum + arr2[j];
        j--;
    }
    sum=sum+carry;
    temp.add(sum%10);
    carry=sum/10;

}
        Collections.reverse(temp);
       String str="";
       boolean flag=false;
        for (int k = 0; k <temp.size() ; k++) {
           if (temp.get(k)==0&&flag==false) {
            continue;
            }
            flag=true;
            str=str+temp.get(k);
        }
        return str;
    }
    public static void main(String[] args) {
        int A[] = {0,0,1,2},
                B[] = {2, 1};
     String ans=calc_Sum(A, A.length, B,B.length);
        System.out.println(ans);
    }
}
