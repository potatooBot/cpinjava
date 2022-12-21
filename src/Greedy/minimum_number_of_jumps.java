package Greedy;

public class minimum_number_of_jumps {
    static int minJumps(int[] arr){
        // your code here

int count=1;
int i=0;
      while (i!= arr.length-1||i> arr.length-1){
          i=i+arr[i];

          if(i> arr.length-1) break;
        if(arr[i]==0){
              return -1;
          }
          count++;
      }
      return count;
    }

    public static void main(String[] args) {
//       int arr[] = {2 ,3, 1, 1, 2, 4, 2, 0 ,1, 1};
       int arr[] ={ 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
       int res=minJumps(arr);
        System.out.println(res);
    }
}
