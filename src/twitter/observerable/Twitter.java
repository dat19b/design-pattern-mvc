package twitter.observerable;

import observer.observer.IChannel;
import twitter.observers.ISubscriber;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Twitter {
    private Tweet tweet;
    private Set<ISubscriber> subscribers = new HashSet<>();

    public void addObserver(ISubscriber s){
        subscribers.add(s);
    }

    public void removeObserver(ISubscriber s){
        subscribers.remove(s);
    }

    public void setTweet(Tweet tweet){
        this.tweet = tweet;
        tell();

    }

    private void tell(){
        for (ISubscriber s : subscribers){
            s.update(tweet);
        }
    }

}
