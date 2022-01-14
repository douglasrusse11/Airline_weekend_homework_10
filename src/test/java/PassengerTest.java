import person.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Simon", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Simon", passenger.getName());
    }

    @Test
    public void hasNumberOfBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }
}
