package person;

import flight.Flight;

public class Passenger extends Person {

    private int numberOfBags;
    private Flight flight;

    public Passenger(String name, int numberOfBags) {
        super(name);
        this.numberOfBags = numberOfBags;
    }

    public int getNumberOfBags() {
        return this.numberOfBags;
    }

    public void addFlight(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return this.flight;
    }
}
