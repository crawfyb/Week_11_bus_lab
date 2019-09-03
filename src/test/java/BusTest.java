import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void setUp() {
        bus = new Bus("Fountain Bridge", 4);
        person = new Person();
        busStop = new BusStop("CodeClan");
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        bus.addPassengerFromQueue(busStop);
        bus.addPassengerFromQueue(busStop);
        bus.addPassengerFromQueue(busStop);

    }

    @Test
    public void hasDestination() {
        assertEquals("Fountain Bridge", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(4, bus.getCapacity());
    }

    @Test
    public void busIsEmptyAtStart() {
        assertEquals(3, bus.numberOfPassengers());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassengerFromQueue(busStop);
        assertEquals(4, bus.numberOfPassengers());
    }

    @Test
    public void cannotAddWhenFullBus() {
        bus.addPassengerFromQueue(busStop);
        bus.addPassengerFromQueue(busStop);
        assertEquals(4, bus.numberOfPassengers());
    }

    @Test
    public void canRemovePassengerFromBus() {
        bus.removePassenger();
        assertEquals(2, bus.numberOfPassengers());
    }

}
