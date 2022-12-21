package ArrayQuestions.RemoveDuplicateFromArray;
import java.util.*;
public class remove_deplicate_from_sorted_array {
    public static int removeDuplicates(int[] arr) {
        HashSet <Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            if(set.contains(arr[i])){
                int x=0;
            }
            set.add(arr[i]);
        }
        // iterating over the hashset
        int i=0;
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
        for(Integer e:list){
            arr[i]=e;
            i++;
        }

        return list.size();
    }
    public static void main(String[] args) {
int arr[]={-3,-1,0,0,0,3,3};
int res=removeDuplicates(arr);
        for (int i = 0; i <res ; i++) {
            System.out.println(arr[i]);
        }
    }
}
