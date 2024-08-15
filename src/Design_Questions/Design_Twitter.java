package Design_Questions;
import java.util.*;
public class Design_Twitter {
    LinkedHashMap<Integer,ArrayList<Integer>> map1;
    HashMap<Integer,ArrayList<Integer>> map2;
    LinkedHashMap<Integer,Integer> map3;

    public Design_Twitter() {
        map1=new LinkedHashMap<>();
        map2=new HashMap<>();
        map3=new LinkedHashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        if(map1.containsKey(userId)){
            ArrayList<Integer> ds=map1.get(userId);
            ds.add(tweetId);
            map1.put(userId,new ArrayList<>(ds));
        }
        else{
            ArrayList<Integer> ds=new ArrayList<>();
            ds.add(tweetId);
            map1.put(userId,new ArrayList<>(ds));
        }


        map3.put(tweetId,userId);
    }

    public List<Integer> getNewsFeed(int userId) {
        Stack<Integer> stk=new Stack<>();
        ArrayList<Integer> ds1=map1.get(userId);
        ArrayList<Integer> ds2=map2.get(userId);
        for(Map.Entry<Integer,Integer> entry:map3.entrySet()){
            if((ds1!=null&&ds1.contains(entry.getValue()))||(ds2!=null&&ds2.contains(entry.getValue()))||entry.getValue()==userId){
                stk.add(entry.getKey());
            }
        }
        

        List<Integer> ans=new ArrayList<>();

        while (stk.isEmpty()==false)
        {
            ans.add(stk.peek());
            stk.pop();
            if(ans.size()==10)break;
        }

        return ans;

    }

    public void follow(int followerId, int followeeId) {
        if(map2.containsKey(followerId)){
            ArrayList<Integer> ds=map2.get(followerId);
            ds.add(followeeId);
            map2.put(followerId,new ArrayList<>(ds));
        }
        else{
            ArrayList<Integer> ds=new ArrayList<>();
            ds.add(followeeId);
            map2.put(followerId,new ArrayList<>(ds));
        }
    }

    public void unfollow(int followerId, int followeeId) {
        ArrayList<Integer> ds=map2.get(followerId);
        ds.remove(Integer.valueOf(followeeId));
        map2.put(followerId,new ArrayList<>(ds));
    }
    public static void main(String[] args) {
        Design_Twitter twitter=new Design_Twitter();
        twitter.postTweet(1,5);
        twitter.follow(1,2);
        twitter.postTweet(2,6);
        System.out.println(twitter.getNewsFeed(1));
        twitter.unfollow(1,2);
        System.out.println(twitter.getNewsFeed(1));
    }
}
