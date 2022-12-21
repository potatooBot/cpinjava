package DSA;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        //Insertion
//        for (int i = 1; i <= 3; i++) {
//            map.put(i, sc.next());
//        }
//
//        //Iteration
//        for (Map.Entry m: map.entrySet()) {
//            System.out.println(m.getKey()+" "+m.getValue());
//        }

        //Search
//        if (map.containsValue("India")){
//            System.out.println("Yes it exist");
//        }
//        else {
//            System.out.println("No");
//        }
//To check if key exist
//        System.out.println(map.get(1));
//        System.out.println(map.get("Indonesia"));
int arr[]={0,0,1,1,1,2,2,3,3,4};
//for(int val :arr){
//    System.out.print(val+" ");
//}

//Way of iterating
//        for (Map.Entry<Integer, String> e : map.entrySet()) {
//            System.out.println(e.getKey() + " " + e.getValue());
//        }
    HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(i,arr[i]);
        }
        for (int i = 0; i <arr.length ; i++) {
            int j=i+1;
            if(map.get(i)==map.get(j)){
                map.remove(i,arr[i]);

            }
        }
        System.out.println(map.size());

    }
}
