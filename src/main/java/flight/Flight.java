package flight;

import person.Passenger;
import person.airlineStaff.CabinCrewMember;
import person.airlineStaff.Pilot;
import plane.Plane;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private CabinCrewMember[] cabinCrewMembers;
    private Passenger[] passengers;
    private Plane plane;
    private String flightNumber, destination, departureAirport, departureTime;

    public Flight(ArrayList<Pilot> pilots,
                  CabinCrewMember[] cabinCrewMembers,
                  Plane plane,
                  String flightNumber,
                  String destination,
                  String departureAirport,
                  String departureTime) {
        this.pilots = pilots;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = new Passenger[plane.getCapacity()];
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getNumberOfPilots() {
        return this.pilots.size();
    }

    public int getNumberOfCabinCrew() {
        return this.cabinCrewMembers.length;
    }

    public int getNumberOfAvailableSeats() {
        int count = 0;
        for (Passenger passenger: this.passengers) {
            if (passenger == null) {
                count ++;
            }
        }
        return count;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public void bookPassenger(Passenger passenger) {
        int i = 0;
        while(passengers[i] != null) {
            i++;
        }
        passengers[i+1] = passenger;
    }

    public Passenger[] getPassengers() {
        return this.passengers;
    }
}
