class Twitter {
    LinkedHashMap<Integer,ArrayList<Integer>> map1;
    HashMap<Integer,ArrayList<Integer>> map2;
    LinkedHashMap<Integer,Integer> map3;

    public Twitter() {
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
            if((ds2!=null&&ds2.contains(entry.getValue()))||entry.getValue()==userId){
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
        if(ds!=null){
        ds.remove(Integer.valueOf(followeeId));
        map2.put(followerId,new ArrayList<>(ds));
    }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */