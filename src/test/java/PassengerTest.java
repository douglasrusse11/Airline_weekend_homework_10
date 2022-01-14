import flight.Flight;
import person.Passenger;
import org.junit.Before;
import org.junit.Test;
import person.airlineStaff.CabinCrewMember;
import person.airlineStaff.Pilot;
import person.airlineStaff.Rank;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

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

    @Test canAddFlight() {
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(new Pilot("Bob", Rank.FIRST_OFFICER, "ABCD123"));
        pilots.add(new Pilot("Ted", Rank.CAPTAIN, "ABCD123"));
        CabinCrewMember[] cabinCrewMembers = new CabinCrewMember[2];
        cabinCrewMembers[0] = new CabinCrewMember("Steve", Rank.FLIGHT_ATTENDANT);
        cabinCrewMembers[1] = new CabinCrewMember("John", Rank.PURSER);
        Plane plane = new Plane(PlaneType.BOEING747, 467, 124000);
        Flight flight = new Flight(pilots, cabinCrewMembers, plane, "FR756", "EDI", "GLA", new Date(2022, 1, 14, 13, 0));
        passenger.addFlight(flight);
        assertEquals(flight, passenger.getFlight());
    }
}
