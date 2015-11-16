package observer;

import observable.Publisher;
import observable.TVStation;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by eric on 2015/11/16.
 */
public class ReaderTest {

    @Test
    public void test() {
        Reader reader = new Reader();

        Publisher publisher = new Publisher();
        publisher.addObserver(reader);
        publisher.publish("Hello !!");

        TVStation station = new TVStation();
        station.addObserver(reader);
        station.play("DORAAEMON");
    }


}