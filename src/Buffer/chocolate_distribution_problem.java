import java.lang.reflect.Array;
import java.util.Arrays;

public class chocolate_distribution_problem {
    public static void main(String[] args) {

        int arr[]={3, 4, 1, 9, 56, 7, 9, 12};
        Arrays.sort(arr);
       int target=5;
        int arr2[]=new int[target];
        for (int i = 0; i <target ; i++) {
            arr2[i]=arr[i];
        }
      int max=arr2[arr2.length-1];
      int min=arr2[0];

        System.out.println(max-min);
    }
}
