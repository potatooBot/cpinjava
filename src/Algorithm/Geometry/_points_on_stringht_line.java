package Algorithm.Geometry;

public class _points_on_stringht_line {
    static public boolean checkStraightLine(int[][] coordinates) {

        int y1=coordinates[0][1];
        int y2=coordinates[1][1];
        int x1=coordinates[0][0];
        int x2=coordinates[1][0];
        double m=0;
        if(x2-x1==0) {
            m=(int)1e9;
        }else {
            m=(y2-y1)/(x2-x1);
        }


        for (int i =0; i <coordinates.length-1 ; i++) {
            int xP=(coordinates[i+1][0]-coordinates[i][0]);
            if(xP==0){
                if(m!=(int)1e9){
                    return false;
                }
            }
            else {
                if ((coordinates[i + 1][1] - coordinates[i][1]) / xP != m) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [][]coordinates = {{0,0},{0,1},{0,-1}};
//        int [][]coordinates = {{1,1},{2,2},{2,0}};

    boolean ans=checkStraightLine(coordinates);
        System.out.println(ans);
    }
}
