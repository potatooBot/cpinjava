//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Twitter obj = new Twitter();
        int total_queries = sc.nextInt();

        while (total_queries-- > 0) {
            int query = sc.nextInt();

            // if query = 1, postTweet()
            // if query = 2, getNewsFeed()
            // if query = 3, follow()
            // if query = 4, unfollow()

            if (query == 1) {
                int userId = sc.nextInt(), tweetId = sc.nextInt();

                obj.postTweet(userId, tweetId);
            } else if (query == 2) {
                int userId = sc.nextInt();

                List<Integer> vec = obj.getNewsFeed(userId);
                for (int a : vec) System.out.print(a + " ");
                System.out.println();
            } else if (query == 3) {
                int follower = sc.nextInt(), followee = sc.nextInt();
                obj.follow(follower, followee);
            } else {
                int follower = sc.nextInt(), followee = sc.nextInt();
                obj.unfollow(follower, followee);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Twitter {

    // Initialize your data structure here
     private Map<Integer, List<Integer>> followersMap;
    
    private Map<Integer, Tweet> tweetsMap;
    
    private int time;
    // Initialize your data structure here
    Twitter() {
        followersMap = new HashMap<>();
        tweetsMap = new HashMap<>();
        time = 1;
    }

    // Compose a new tweet
    void postTweet(int userId, int tweetId) {
        Tweet existingTweet = tweetsMap.get(userId);
        if (existingTweet == null) {
            existingTweet = new Tweet(tweetId, time++);
        } else {
            Tweet tweet = new Tweet(tweetId, time++);
            tweet.next = existingTweet;
            existingTweet = tweet;
        }
        tweetsMap.put(userId, existingTweet);
    }

    // Retrieve the 10 most recent tweet ids as mentioned in question
    List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> minHeap = new PriorityQueue<>(new Comparator<Tweet>(){
            @Override
            public int compare(Tweet tweet1, Tweet tweet2) {
                return tweet2.time - tweet1.time;
            }
        });
        if (tweetsMap.get(userId) != null) {
            minHeap.add(tweetsMap.get(userId));
        }
        for (int followers : followersMap.getOrDefault(userId, new ArrayList<>())) {
            if (tweetsMap.get(followers) != null) {
                minHeap.add(tweetsMap.get(followers));
            }
        }
        int count = 0;
        List<Integer> newsFeed = new ArrayList<>();
        while (count < 10 && !minHeap.isEmpty()) {
            Tweet tweet = minHeap.poll();
            newsFeed.add(tweet.tweetId);
            if (tweet.next != null) {
                minHeap.add(tweet.next);
            }
            count++;
        }
        return newsFeed;
    }

  
    void follow(int followerId, int followeeId) {
        followersMap.putIfAbsent(followerId, new ArrayList<>());
        followersMap.get(followerId).add(followeeId);
    }

    void unfollow(int followerId, int followeeId) {
        List<Integer> followers = followersMap.getOrDefault(followerId, new ArrayList<>());
        if (followers.contains(followeeId)) {
            followers.remove(Integer.valueOf(followeeId));
        }
    }
}
class Tweet {
    int tweetId;
    int time;
    Tweet next;
    public Tweet(int tweetId, int time) {
        this.tweetId = tweetId;
        this.time = time;
        this.next = null;
    }
}