package observable;

import java.util.Observable;

/**
 * Created by eric on 2015/11/16.
 */
public class TVStation extends Observable {

    private String programmeName;

    public void play(String programmeName) {
        this.programmeName = programmeName;
        setChanged();
        notifyObservers(this);
    }

    public String getProgrammeName() {
        return programmeName;
    }
}
