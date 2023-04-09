package Algorithm.Binary_Search;

public class serach_in_rotated_array {
    static  int search(int nums[], int l, int h, int target)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range

int low=l;
int high=h;
while (low<=high){
    int mid=(low+high)/2;
    if(nums[mid]==target) return mid;
    if(nums[low]<=nums[mid]){
        if(nums[low]<=target&&target<=nums[mid])
        {
            high=mid-1;
        }
else {
    low=mid+1;
        }



    }
    else {
        if(target>=nums[mid]&&target<=nums[high])
        {
            low=mid+1;
        }
        else high=mid-1;
    }
}

    return -1;    // Complete this function
    }
    public static void main(String[] args) {
        int N = 9;
        int A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key=10;
        int l = 0 , h = 8;
int ans=search(A,l,h,key);
        System.out.println(ans);
    }
}
