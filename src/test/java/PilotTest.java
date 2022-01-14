import org.junit.Test;
import person.airlineStaff.Pilot;
import org.junit.Before;
import person.airlineStaff.Rank;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Bob", Rank.FIRST_OFFICER, "ABCD123");
    }

    @Test
    public void hasName() {
        assertEquals("Bob", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.FIRST_OFFICER, pilot.getRank);
    }

    @Test
    public void hasLicenseNumber() {
        assertEquals("ABCD123", pilot.getLicenseNumber());
    }

}
