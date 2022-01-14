import org.junit.Test;
import person.airlineStaff.CabinCrewMember;
import org.junit.Before;
import person.airlineStaff.Rank;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Steve", Rank.CAPTAIN);
    }

    @Test
    public void hasName() {
        assertEquals("Steve", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.CAPTAIN, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessage() {
        assertEquals("It's going down", cabinCrewMember.relayMessage("It's going down"));
    }
}
