package Greedy;
import java.util.*;
class meeting_max{
    int start;
    int end;
    int pos;

    public meeting_max(int start,int end,int pos){
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}

class meetingComparator_max implements Comparator<meeting_max>{
    @Override
    public int compare(meeting_max o1,meeting_max o2){
        if(o1.end<o2.end){
            return -1;
        }
        else if(o1.end>o2.end) {
            return 1;
        }
        else if(o1.pos < o2.pos){
            return -1;
        }
        return 1;
    }
}
public class maximum_meeting_in_room {
    public static void maxMeetings(int n, int[] start, int[] end)
    // code here
    {
        ArrayList <meeting_max> meet=new ArrayList<>();

        for(int i=0;i<start.length;i++){
            meet.add(new meeting_max(start[i],end[i],i+1));
        }
        meetingComparator_max mc_max = new meetingComparator_max();

        Collections.sort(meet,mc_max);
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end;


        for(int i = 1;i<n;i++) {
//            System.out.println("checking for start= "+meet.get(i).start +" limit = "+limit +" and pos = "+ i);
            if(meet.get(i).start > limit) {
                limit = meet.get(i).end;

                answer.add(meet.get(i).pos);
            }
        }
        for(int i = 0;i<answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int start[] = {12 ,6 ,16 ,12 ,6 ,9 ,16 ,6 ,17 ,5};
        int finish[] = {17 ,13 ,16 ,18 ,17 ,10 ,18 ,12 ,18,11};

  ArrayList <Integer> ans=new ArrayList<>();
        maxMeetings(start.length, start,finish);
//        System.out.println(ans);
    }
}
