package DSA.Array;

public class reverse_array {
    static void reversearray(int arr[],int start,int end){
int temp;
while(start<end){
    temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
}
    }
    static void printarray(int arr[],int size){
        System.out.println("the array is ");
        for (int i = 0; i <=size ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
int arr[]={1,2,3,4,5,6};
printarray(arr,arr.length-1);
reversearray(arr,0, arr.length-1);
printarray(arr,arr.length-1);
    }
}
