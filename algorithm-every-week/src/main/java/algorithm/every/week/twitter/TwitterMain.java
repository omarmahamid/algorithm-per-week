package algorithm.every.week.twitter;

public class TwitterMain{


    public static void main(String[] args) {

        Twitter twitter = new Twitter();

        twitter.postTweet(1,5);
        System.out.println(twitter.getNewsFeed(1));

        twitter.follow(1, 2);

        System.out.println(twitter.getNewsFeed(1));

        twitter.postTweet(2, 6);
        twitter.postTweet(2, 7);
        twitter.postTweet(2, 8);
        twitter.postTweet(2, 9);
        twitter.postTweet(2, 10);
        twitter.postTweet(2, 11);
        twitter.postTweet(2, 12);
        twitter.postTweet(2, 13);
        twitter.postTweet(2, 14);
        twitter.postTweet(2, 15);
        twitter.postTweet(2, 16);
        twitter.postTweet(2, 17);
        twitter.postTweet(2, 18);

        System.out.println(twitter.getNewsFeed(1));

        twitter.unfollow(1,2);

        System.out.println(twitter.getNewsFeed(1));


    }
}
