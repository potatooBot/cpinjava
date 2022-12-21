package Greedy;
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
//You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:
//
//        numberOfBoxesi is the number of boxes of type i.
//        numberOfUnitsPerBoxi is the number of units in each box of the type i.
//        You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.
//
//        Return the maximum total number of units that can be put on the truck.
//
//
//
//        Example 1:
//
//        Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
//        Output: 8
//        Explanation: There are:
//        - 1 box of the first type that contains 3 units.
//        - 2 boxes of the second type that contain 2 units each.
//        - 3 boxes of the third type that contain 1 unit each.
//        You can take all the boxes of the first and second types, and one box of the third type.
//        The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.


class boxes{
    int no_of_box;
    int box_per_unit;
    public boxes(int no_of_box,int box_per_unit){
        this.no_of_box=no_of_box;
        this.box_per_unit=box_per_unit;
    }
}
class mycompareforboxes implements Comparator<boxes>{
    public int compare(boxes item1,boxes item2){
if(item1.box_per_unit<item2.box_per_unit) {return 1;}
if(item1.box_per_unit>item2.box_per_unit) {return -1;}
else return 0;
    }
}
public class max_unit_in_truck {
    public static void maximumUnits(int[][] boxTypes, int truckSize) {
        int no_of_box[] = new int[boxTypes.length];
        for (int i = 0; i < boxTypes.length; i++) {
            no_of_box[i] = boxTypes[i][0];
        }
        int unit_per_box[] = new int[boxTypes.length];
        for (int i = 0; i < boxTypes.length; i++) {
            unit_per_box[i] = boxTypes[i][1];
        }
        ArrayList <boxes> list=new ArrayList<>();
        for (int i = 0; i <unit_per_box.length ; i++) {
            list.add(new boxes(no_of_box[i],unit_per_box[i] ));
        }
        mycompareforboxes mc_for_boxes=new mycompareforboxes();
        Collections.sort(list,mc_for_boxes);

        int total=0;

        for (int i = 0; i <list.size() ; i++) {
            int box_number=list.get(i).no_of_box;
            int box_per_unit=list.get(i).box_per_unit;
//            System.out.println(truckSize);
if(truckSize-box_number>=0){
    truckSize=truckSize-box_number;
    total=total+box_per_unit*box_number;
}
else {
     if(box_number-truckSize>=0){
total=total +truckSize*box_per_unit;
truckSize=truckSize-truckSize;
    }
}
            System.out.println(total);

//            System.out.println(total);
        }
    }
    public static void main(String[] args) {
        int[][] boxTypes = {{5,10}, {2, 5}, {4, 7},{3,9}};
        int trucksize=10;
        maximumUnits(boxTypes,trucksize);

    }
}
