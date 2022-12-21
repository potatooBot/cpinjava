public class sort_colors {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int arr[],int low,int high){
int pivot=arr[high];
int i=low-1;
        for (int j = low; j <=high-1 ; j++) {
            if(arr[j]>pivot){
                i++;
                swap(arr,i,j);
            }
        }
swap(arr,i+1,high);
    return (i+1);
    }

    static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pidx=partition(arr,low,high);
            quicksort(arr,low,pidx-1);
            quicksort(arr,pidx+1,high);
        }
    }

    static void printArray(int arr[],int size){
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,2,0,0,1,3};
        quicksort(arr,0,arr.length-1);
        printArray(arr,arr.length);
    }
}
