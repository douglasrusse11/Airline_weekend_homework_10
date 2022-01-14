import flight.Flight;
import flight.FlightManager;
import org.junit.Before;
import org.junit.Test;
import person.Passenger;
import person.airlineStaff.CabinCrewMember;
import person.airlineStaff.Pilot;
import person.airlineStaff.Rank;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;

    @Before
    public void before() {
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(new Pilot("Bob", Rank.FIRST_OFFICER, "ABCD123"));
        pilots.add(new Pilot("Ted", Rank.CAPTAIN, "ABCD123"));
        CabinCrewMember[] cabinCrewMembers = new CabinCrewMember[2];
        cabinCrewMembers[0] = new CabinCrewMember("Steve", Rank.FLIGHT_ATTENDANT);
        cabinCrewMembers[1] = new CabinCrewMember("John", Rank.PURSER);
        Plane plane = new Plane(PlaneType.BOEING747, 467, 124000);
        Flight flight = new Flight(pilots, cabinCrewMembers, plane, "FR756", "EDI", "GLA", new Date(2022, 1, 14, 13, 0));
        flightManager = new FlightManager(flight);
    }

    @Test
    public void hasFlight() {
        assertEquals(Flight.class, flightManager.getFlight().getClass());
    }

    @Test
    public void canCalculateBaggageWeightPerPassenger() {
        assertEquals(132.8, flightManager.getBaggageWeightPerPassenger(), 0.1);
    }

    @Test
    public void canCalculateTotalBaggageWeight() {
        flightManager.getFlight().bookPassenger(new Passenger("Simon", 2));
        assertEquals(46, flightManager.getTotalBaggageWeight(), 0.0);
    }

    @Test
    public void canCalculateRemainingBaggageWeight() {
        flightManager.getFlight().bookPassenger(new Passenger("Simon", 2));
        assertEquals(61954, flightManager.getRemainingBaggageWeight(), 0.0);
    }

}
