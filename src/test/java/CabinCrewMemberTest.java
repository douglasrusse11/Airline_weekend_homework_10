import org.junit.Test;
import person.airlineStaff.CabinCrewMember;
import org.junit.Before;
import person.airlineStaff.Rank;

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
        assertEquals("CAPTAIN", cabinCrewMember.getRank());
    }
}
