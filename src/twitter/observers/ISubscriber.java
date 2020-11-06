package twitter.observers;

import twitter.observerable.Tweet;

public interface ISubscriber {
    void update(Tweet tweet);
}
