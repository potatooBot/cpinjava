package Leetcode_Daily;

public class delete_colum_to_make_it_sorted_944 {
    public static int minDeletionSize(String[] A) {
        int count = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[j-1].charAt(i) > A[j].charAt(i)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
//        String strs[] = {"cba","daf","ghi"};
        String strs[] = {"rrjk","furt","guzm"};
//        String strs[] = {"a","b"};
        int count=minDeletionSize(strs);
        System.out.println(count);
    }
}
