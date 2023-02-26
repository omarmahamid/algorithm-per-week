package algorithm.every.week.twitter;

import java.util.*;

class Twitter {

    private final Map<Integer, Set<Integer>> following;
    private final Map<Integer, List<Tweet>> feed;
    private int time;
    private static final int MAX_TWEETS = 10;

    public Twitter() {
        this.following = new HashMap<>();
        this.feed = new HashMap<>();
        this.time = 0;
    }

    public void postTweet(int userId, int tweetId) {
        if(isNewUser(userId)){
            addNewUser(userId);
        }

        feed.get(userId).add(new Tweet(tweetId, time));
        time++;
    }

    public List<Integer> getNewsFeed(int userId) {
        if(isNewUser(userId)){
            addNewUser(userId);
        }

        PriorityQueue<Tweet> minHeap = new PriorityQueue<>((a, b) -> b.timeStamp - a.timeStamp);
        for(Integer followingId : following.get(userId)){
            if(feed.containsKey(followingId)){
                for(Tweet tweet : feed.get(followingId)){
                    minHeap.offer(tweet);
                }
            }
        }

        List<Integer> userFeed = new ArrayList<>();
        while(userFeed.size() < MAX_TWEETS && !minHeap.isEmpty()){
            userFeed.add(minHeap.poll().tweetId);
        }

        return userFeed;
    }

    public void follow(int followerId, int followeeId) {
        if(isNewUser(followerId)){
            addNewUser(followerId);
        }

        following.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if(!isNewUser(followerId)){
            following.get(followerId).remove(followeeId);
        }
    }

    public boolean isNewUser(int userId){
        return !following.containsKey(userId);
    }

    public void addNewUser(int userId){
        following.put(userId, new HashSet<>());
        following.get(userId).add(userId);
        feed.put(userId, new ArrayList<>());
    }

    static class Tweet {
        int tweetId;
        int timeStamp;

        Tweet(int tweetId, int timeStamp){
            this.tweetId = tweetId;
            this.timeStamp = timeStamp;
        }
    }
}
