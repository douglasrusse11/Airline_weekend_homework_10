package flight;

import person.Passenger;
import plane.Plane;

public class FlightManager {

    private Flight flight;
    private static double bagWeight = 23;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public double getBaggageWeightPerPassenger() {
        Plane plane = this.flight.getPlane();
        return plane.getTotalWeight()/2/plane.getCapacity();
    }

    public double getTotalBaggageWeight() {
        double totalWeight = 0;
        Passenger[] passengers = flight.getPassengers();
        for (Passenger passenger: passengers) {
            if (passenger != null) {
                totalWeight += bagWeight * passenger.getNumberOfBags();
            }
        }
        return totalWeight;
    }

    public double getRemainingBaggageWeight() {
        return this.flight.getPlane().getTotalWeight()/2 - getTotalBaggageWeight();
    }
}
