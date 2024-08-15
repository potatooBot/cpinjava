package Company_Wise.Goldman_Sachs;

import java.util.ArrayList;

public class singing_teacher {
    public static int whoIsElected(int n,int k){
        ArrayList<Integer> ds=new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            ds.add(i);
        }

        if(ds.size()==1) return 1;
        int idx=0;
        while (idx<=ds.size()-1&&ds.size()>0){
            idx=(idx+k)%ds.size()-1;
            if(idx==-1){idx=ds.size()-1;
            ds.remove(idx);
            idx=0;
            continue;};
            ds.remove(idx);
        }
        return ds.get(0);
    }
//    public static void main(String[] args) {
//        ArrayList<Integer> ds=new ArrayList<>();
//
//        for (int i = 1; i <=5 ; i++) {
//            ds.add(i);
//        }
//        int k=2;
//        System.out.println(getPresident(ds,k));
//    }
public static boolean doTestsPass() {
    // todo: implement more tests, please
    // feel free to make testing more elegant
    // test cases are structered as {n, k, expected answer}
    int[][] testCases = {
     //  {1, 1, 1},
      //      {2, 2, 1},
          // {4, 2, 1},
//     {100, 2, 73},
         {5, 3, 4},
//            {6, 4, 5},
//            {1000, 5, 763}
    };

    for (int[] testCase : testCases) {
        int answer = whoIsElected(testCase[0], testCase[1]);
        if (answer != testCase[2]) {
            System.out.println("test failed!");
            System.out.printf("n:%d, k%d, answer got: %d, should be: %d\n", testCase[0], testCase[1], answer, testCase[2]);
            return false;
        }
    }
    System.out.println("All tested passed");
    return true;
}




 public static void main(String args[]) {
 doTestsPass();
 }
 }


