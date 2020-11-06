package observer.observer;

public class DR implements IChannel{

    public void update(String news) {
        System.out.println("DR: " + news);
    }
}
