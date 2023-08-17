package Algorithm.Binary_Search.Search_in_rotated_array_2;

public class seacrh_in_rotated_array_2 {
    public static boolean Search(int N, int[] nums, int target) {


        int low = 0;
        int high = nums.length-1;


        while (low <=high) {
            int mid = (low + high) / 2;


            if (nums[mid] == target) return true;

            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low ++;
                high --;
                continue;
            }

            if (nums[low] < nums[mid]) {

                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }


              // code here
        }
        return false;
    }
    public static void main(String[] args) {
        int N = 7;
        int arr[] = {2,5,6,0,0,1,2};
        int key = 3;
        boolean ans=Search(N,arr,key);
        System.out.println(ans);
    }
}
