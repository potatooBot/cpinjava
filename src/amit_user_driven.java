import java.util.*;

public class amit_user_driven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> list=new ArrayList<>();
        list.add(15);
        list.add(150);
        list.add(125);
        list.add(225);
        list.add(15);
        list.add(15);
        for (int ele: list) {
            System.out.println(ele);
        }

        for (int i = 0; i <100 ; i++) {
            System.out.println("Enter one value");
            int n=sc.nextInt();
            if(n==1) {
                System.out.println("Enter  the number of Subjects");
                int noOfSubjects = sc.nextInt();
                System.out.println("Enter Name");
                String name=sc.next();
                for (int j = 1; j <= noOfSubjects; j++) {
                    System.out.println("Enter "+j+" Subject Marks");
                   int marks = sc.nextInt();
                    if(marks>=90)
                        System.out.println(name+ " You got Excellent Marks");
                    else if(marks>=51&&marks<=89)
                        System.out.println(name+"You got Good Marks");
                else if(marks>=0&&marks<=50) System.out.println(name+" Poor performance");
                }
            }
            else if(n==0) {
              break;
            }
        }
    }
}
