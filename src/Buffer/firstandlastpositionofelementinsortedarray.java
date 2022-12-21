import java.util.*;
public class firstandlastpositionofelementinsortedarray {
    public static void main(String[] args) {
        int arr[]= {2,2};
        int arr2[]=new int[2];
        arr2[0]=0;
        arr2[1]=0;
        ArrayList <Integer> arr_new=new ArrayList<>();
        ArrayList <Integer> finalarr2=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            arr_new.add(arr[i]);
        }
        int target=2;
        for (int i = 0; i <arr.length; i++) {
int res=Collections.binarySearch(arr_new,target);
            System.out.println(res);
if(res>=0){
    System.out.println("entered with "+res);
    finalarr2.add(res);
     arr_new.set(res,target+1);
    System.out.println(arr_new);
}
else if(res<0){
 arr2[0]=-1;
 arr2[1]=-1;
 break;
}

        }

        if(finalarr2.isEmpty()){
            System.out.println(arr2[0]+" "+arr2[1]);
        }
        else {
            Collections.sort(finalarr2);
            int min = Collections.min(finalarr2);
            int max = Collections.max(finalarr2);
            arr2[0] = min;
            arr2[1] = max;
        }
        System.out.println(arr2[0]+" "+arr2[1]);
    }
}
