package Important_Concepts;

import java.util.Arrays;
import java.util.HashMap;

public class minimum_swaps_to_sort_an_array_using_hashMap {
    static  public int minSwaps(int nums[])
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n= nums.length;
        int temp[]= Arrays.copyOfRange(nums,0,n);
        Arrays.sort(temp);
int ans=0;
        for (int i = 0; i <n ; i++) {
            System.out.print(temp[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <n ; i++) {
            System.out.print(nums[i]+" ");
        }


        System.out.println();
        for (int i = 0; i <n ; i++) {
            map.put(nums[i],i);
        }

        System.out.println(map);
        for (int i = 0; i <n ; i++) {
            if(nums[i]==temp[i]) continue;
            else {
       ans++;
                int iniatialPos=nums[i];
                swap(nums,i,map.get(temp[i]));
map.put(iniatialPos,map.get(temp[i]));
map.put(temp[i],i);
            }
        }
        System.out.println();
        for (int i = 0; i <n ; i++) {
            System.out.print(nums[i]+" ");
        }

     return ans;   // Code here
    }
    public static void swap(int [] nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    public static void main(String[] args) {
        int [] nums = {10, 19, 6, 3, 5};
        System.out.println(minSwaps(nums));
    }
}
