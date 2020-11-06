package observer.observer;

public class LocalNews implements IChannel{


    @Override
    public void update(String news) {
        System.out.println("AHHHHH");
    }
}
