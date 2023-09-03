class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
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
}