//Problem Link: Ninja Training
//
//        A Ninja has an ‘N’ Day training schedule. He has to perform one of these three
//        activities (Running, Fighting Practice, or Learning New Moves) each day.
//        There are merit points associated with performing an activity each day.
//        The same activity can’t be performed on two consecutive days.
//        We need to find the maximum merit points the ninja can attain in N Days.
//
//        We are given a 2D Array POINTS of size ‘N*3’ which tells us the merit point of
//        specific activity on that particular day.
//        Our task is to calculate the maximum number of merit points that the ninja can earn.-

package Algorithm.Dynamic_Programming.Tabulation;

public class ninja_training_2d {

        public static void main(String args[]) {

            int[][] points = {{10,40,70},
                    {20,50,80},
                    {30,60,90}};

int n= points.length;






        }

}


//    Time Complexity: O(N*4*3)
//
//        Reason: There are three nested loops
//
//        Space Complexity: O(N*4)
//
//        Reason: We are using an external array of size ‘N*4’’.