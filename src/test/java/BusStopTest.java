import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before() {
        busStop = new BusStop("Code Clan Special Bus Stop");
        person = new Person();
    }

    @Test
    public void hasName() {
        assertEquals("Code Clan Special Bus Stop", busStop.getName());
    }

    @Test
    public void queueIsEmpty() {
        assertEquals(0, busStop.lengthOfQueue());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.lengthOfQueue());
    }

    @Test
    public void removePersonFromQueue() {
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(1, busStop.lengthOfQueue());

    }
}
