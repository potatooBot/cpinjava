package Greedy;

import java.util.Arrays;

public class majority_element {
    public static int majorityElement(int arr[], int size)
    {
        // your code here
        int count=0;
        int maj=-1;
        if(size==1){
            return arr[0];
        }

        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1])
            {
                count=0;
            }
            else {
                count++;

            }
            if(count>=Math.ceil(arr.length/2))
            {
                maj=arr[i];
            }
        }
        return maj;
    }
    public static void main(String[] args) {
        int arr[]={15};
       int res= majorityElement(arr,arr.length);
        System.out.println(res);
    }
}
