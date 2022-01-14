import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import person.Passenger;
import person.airlineStaff.CabinCrewMember;
import person.airlineStaff.Pilot;
import person.airlineStaff.Rank;
import plane.Plane;
import plane.PlaneType;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightTest {

    private Flight flight;

    @Before
    public void before() {
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(new Pilot("Bob", Rank.FIRST_OFFICER, "ABCD123"));
        pilots.add(new Pilot("Ted", Rank.CAPTAIN, "ABCD123"));
        CabinCrewMember[] cabinCrewMembers = new CabinCrewMember[2];
        cabinCrewMembers[0] = new CabinCrewMember("Steve", Rank.FLIGHT_ATTENDANT);
        cabinCrewMembers[1] = new CabinCrewMember("John", Rank.PURSER);
        Plane plane = new Plane(PlaneType.BOEING747, 467, 124000);
        flight = new Flight(pilots, cabinCrewMembers, plane, "FR756", "EDI", "GLA", "13:00");
    }

    @Test
    public void hasAtLeastOnePilot() {
        assertTrue(flight.getNumberOfPilots() >= 1);
    }

    @Test
    public void hasCabinCrewMembers() {
        assertEquals(2, flight.getNumberOfCabinCrew());
    }

    @Test
    public void hasEmptyPassengerList() {
        assertEquals(467, flight.getNumberOfAvailableSeats());
    }

    @Test
    public void hasPlane() {
        assertEquals(Plane.class, flight.getPlane().getClass());
    }

    @Test
    public void hasDestination() {
        assertEquals("EDI", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("13:00", flight.getDepartureTime());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(new Passenger("Simon", 2));
        assertEquals(466, flight.getNumberOfAvailableSeats());
    }

    @Test
    public void canGetPassengers() {
        assertEquals(Passenger[].class, flight.getPassengers());
    }
}
