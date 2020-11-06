package observer.observerable;

import observer.observer.IChannel;

import java.util.ArrayList;
import java.util.List;

public class AP {

    private String news;
    private List<IChannel> channels = new ArrayList<>();

    public void addObserver(IChannel ob){
        channels.add(ob);
    }

    public void removeObserver(IChannel ob){
        channels.remove(ob);
    }

    public void setNews(String news){
        this.news = news;
        for (IChannel ch : this.channels){
            ch.update(news);
        }
    }



}
