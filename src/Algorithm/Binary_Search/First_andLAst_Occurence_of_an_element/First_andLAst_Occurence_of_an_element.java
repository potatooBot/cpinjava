package Algorithm.Binary_Search.First_andLAst_Occurence_of_an_element;
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
public class First_andLAst_Occurence_of_an_element {
    public static int getFirst(long arr[],long x){
        int first=-1;

        int low=0;
        int high= arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                high=mid-1;
                first=mid;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else {
                high=mid-1;
            }


        }
        return first;
    }
    public static int getLast(long arr[],long x){
        int last=-1;

        int low=0;
        int high= arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                low=mid+1;
                last=mid;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else {
                high=mid-1;
            }


        }
        return last;
    }
    static public pair indexes(long arr[], long x)
    {

     int first=getFirst(arr,x);
        int last=getLast(arr,x);

pair ans=new pair((long) first,(long) last);
        // Your code goes here
    return ans;
    }
    public static void main(String[] args) {
        int N = 9;
        long arr[] = {1, 3, 5, 5, 5, 5, 7, 123, 125};
        int x=7;
pair ans=indexes(arr,x);
        System.out.println(ans.first);
        System.out.println(ans.second);

    }
}
