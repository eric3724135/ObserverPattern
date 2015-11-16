package observable;

import java.util.Observable;

/**
 * Created by eric on 2015/11/16.
 */
public class Publisher extends Observable {
    private String magazineName;


    public String getMagazineName() {
        return magazineName;
    }

    public void publish(String magazineName) {
        this.magazineName = magazineName;
        setChanged();
        notifyObservers(this);
    }
}
