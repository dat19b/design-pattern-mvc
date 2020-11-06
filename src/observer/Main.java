package observer;

import observer.observer.DR;
import observer.observer.LocalNews;
import observer.observer.TV2;
import observer.observerable.AP;

public class Main {
    public static void main(String[] args) {
        // Assosiated press (observerable / subject)
        AP model = new AP();
        // view DR (observer)
        DR view = new DR();
        LocalNews ln = new LocalNews();

        model.addObserver(view);
        model.addObserver(new TV2());
        model.addObserver(ln);


        model.setNews("Trump win the elction for the second time");
        model.setNews("Trump did not win the elction for the second time anyway");

        model.removeObserver(ln);

        model.setNews("Hello Thorning græder sig selv i søvn");
        model.setNews("Hello Thorning græder sig selv i søvn");
    }
}
