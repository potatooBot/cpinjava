import java.util.*;
public class contain_duplicate_using_binary_search {
    public static void main(String[] args) {
        int a[]={1,2,2,3,1};

//        O (n), where "n" is the array's total number of elements. The issue can be solved linearly by using a hash set.
//        Since employing a hash set improves the effectiveness of searches, deletions, and data insertion
        HashSet<Integer> D_set = new HashSet<>();
        for (int i=0; i<a.length; i++)
        {
            if (D_set.contains(a[i])){
                System.out.println(true);
                break;
            }
            D_set.add(a[i]);
            if (i >= a.length  )
                D_set.remove(a[i-a.length]);
        }
        System.out.println(false);
    }

}
