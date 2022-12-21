import java.util.*;
public class search_in_rotated_aray {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target=4;
        int result=0;
        for (int i = 0; i <nums.length ; i++) {
            result=i;
            if(nums[i]==target){
                System.out.println(result);
                break;
            }
            result=-1;
        }
        if(result==-1){
            System.out.println(result);
        }
    }
}
