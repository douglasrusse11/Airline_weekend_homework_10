package plane;

public class Plane {

    private PlaneType planeType;
    private int capacity;
    private double totalWeight;

    public Plane(PlaneType planeType, int capacity, double totalWeight) {
        this.planeType = planeType;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getTotalWeight() {
        return this.totalWeight;
    }
}
