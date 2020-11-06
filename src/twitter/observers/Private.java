package twitter.observers;

import twitter.observerable.Tweet;

public class Private implements ISubscriber {
    @Override
    public void update(Tweet tweet) {
        System.out.println("New Tweet: " +  tweet);
    }
}
