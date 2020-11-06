package observer.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TV2 implements IChannel{

    Set<String> tv2_news = new HashSet<>();

    @Override
    public void update(String news) {
        tv2_news.add(news);

        for (String s : tv2_news) {
            System.out.println("TV2: " + s);
        }

    }
}
