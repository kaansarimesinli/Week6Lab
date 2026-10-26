package week6lab;

public class Ride {
    
    private String passengerName, pickup, destination;
    private double distanceKm, pricePerKm;
    private int durationMin;

    public Ride(String passengerName, String pickup, String destination, double distanceKm, double pricePerKm, int durationMin) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;
        if(distanceKm <= 0) {
            System.out.println("WARNING: Distance must be positive!");
            this.distanceKm = 1;
        }else {
            this.distanceKm = distanceKm;
        }
        
        if(pricePerKm <= 0) {
            System.out.println("WARNING: Price Per KM must be positive!");
            this.pricePerKm = 1;
        }else {
            this.pricePerKm = pricePerKm;
        }
        
        if(durationMin <= 0) {
            System.out.println("WARNING: Duration must be positive!");
            this.durationMin = 1;
        }else {
            this.durationMin = durationMin;
        }
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public int getDurationMin() {
        return durationMin;
    }
    
    public double calculateFare() {
        return distanceKm * pricePerKm;
    }
    
    @Override
    public String toString() {
        return String.format("Passenger Name: %s, Pickup: %s, Destination: %s, Distance: %.1f KM, Price Per KM: %.1f $, Duration: %d Minute, Fare: %.1f $%n", passengerName, pickup, destination, distanceKm, pricePerKm, durationMin, calculateFare());
    }
}
