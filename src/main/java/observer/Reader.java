package observer;

import observable.Publisher;
import observable.TVStation;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by eric on 2015/11/16.
 */
public class Reader implements Observer {


    public void update(Observable o, Object arg) {
        if (o instanceof Publisher) {
            Publisher p = (Publisher) o;
            System.out.println("Publisher publish magazine : " + p.getMagazineName());
        }
        if (o instanceof TVStation) {
            TVStation t = (TVStation) o;
            System.out.println("I'm watching at " + t.getProgrammeName());
        }
    }
}
