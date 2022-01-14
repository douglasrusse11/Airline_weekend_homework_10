package person.airlineStaff;

import person.Person;

public abstract class AirlineStaff extends Person {

    private Rank rank;

    public AirlineStaff(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return this.rank;
    }
}
