package Graph.BFS.Minimum_Cost_robot_of_Homecoming;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class pair{
    int row,col,dist;
    pair(int row,int col,int dist){
        this.row=row;
        this.col=col;
        this.dist=dist;
    }
}
public class minimum_cost_of_robot_to_homecoming {
    static  public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
       int totCost=0;
        if(homePos[0]>startPos[0]){
            int i=startPos[0]+1;
            while (i<=homePos[0]){
                totCost=totCost+rowCosts[i];
                i++;
            }
        }
        else if(homePos[0]<startPos[0]){
            int i=startPos[0]-1;
            while (i>=homePos[0]){
                totCost=totCost+rowCosts[i];
                i--;
            }
        }



        if(startPos[1]<homePos[1]){
            int i=startPos[1]+1;
            while (i<=homePos[1]){

                totCost=totCost+colCosts[i];
                i++;
            }
        }

        else if(startPos[1]>homePos[1]){
            int i=startPos[1]-1;
            while (i>=homePos[1]){
                totCost=totCost+colCosts[i];
                i--;
            }
        }


        return totCost;
    }
    public static void main(String[] args) {
        int startPos[] = {1, 0}, homePos[] = {2, 3}, rowCosts[] = {5, 4, 3}, colCosts[] = {8, 2, 6, 7};
int ans=minCost(startPos,homePos,rowCosts,colCosts);
        System.out.println(ans);
    }
}
