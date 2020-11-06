package twitter;

import twitter.observerable.Tweet;
import twitter.observerable.Twitter;
import twitter.observers.Private;

public class Main {
    public static void main(String[] args) {
        Twitter model = new Twitter();
        model.addObserver(new Private());


        // Tweet
        Tweet t = new Tweet();
        t.setHeadline("You are all criminals!");
        t.setBody("Not all people are criminals");
        t.setImg("*****");

        model.setTweet(t);
    }
}
