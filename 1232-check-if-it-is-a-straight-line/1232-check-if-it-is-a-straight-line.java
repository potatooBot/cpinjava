class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
                int y1=coordinates[0][1];
        int y2=coordinates[1][1];
        int x1=coordinates[0][0];
        int x2=coordinates[1][0];
        double m=0;
        
        if(x2-x1==0) {
            m=(int)1e9;
        }else {
            m=(double)((double)(y2-y1)/(double)(x2-x1));
        }
        System.out.println(m);
        for (int i =0; i <coordinates.length-1 ; i++) {
            double xP=((double)coordinates[i+1][0]-(double)coordinates[i][0]);
            if(xP==0){
                if(m!=(int)1e9){
                    return false;
                }
            }
            else {
                if ((double)((double)coordinates[i + 1][1] - (double)coordinates[i][1]) / xP != m) {
                    return false;
                }
            }
        }
        return true;
    }
}