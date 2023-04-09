package Two_Pointers;

public class remove_element_from_sorted_array{
static   int remove_duplicate(int nums[],int N){

    for (int i = 0; i <N-1 ; i++) {
        for (int j = i+1; j <N ; j++) {
            if(j==N) break;

            if(nums[i]==nums[j]){
                while (nums[i]!=nums[j]){
                    j++;
                }
                nums[i+1]=nums[j];
            }


        }
    }

    for (int i = 0; i <N ; i++) {
        System.out.println(nums[i]);
    }

 return 0;
    // code here
}

        public static void main(String[] args) {
            int N = 5;
            int arr[] = {2, 2, 2, 2, 2};
remove_duplicate(arr,N);
        }

}
