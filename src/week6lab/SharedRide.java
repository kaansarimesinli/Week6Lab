package week6lab;

public class SharedRide extends EconomyRide{

    private int passengerCount;

    public SharedRide(String passengerName, String pickup, String destination, double distanceKm, double pricePerKm, int durationMin, double pricePerMinute, int passengerCount) {
        super(passengerName, pickup, destination, distanceKm, pricePerKm, durationMin, pricePerMinute);
        if(passengerCount < 1 || passengerCount > 4) {
            System.out.println("WARNING: Passenger Count must be between 1 and 4!");
            this.passengerCount = 1;
        }else {
            this.passengerCount = passengerCount;
        }
    }
    
    @Override
    public double calculateFare() {
        return super.calculateFare() / passengerCount * 1.1;
    }
    
    @Override
    public String toString() {
        return String.format("Passenger Name: %s, Pickup: %s, Destination: %s, Distance: %.1f KM, Price Per KM: %.1f $, Duration: %d Minute, Price Per Minute: %.1f $, Passenger Count: %d, Fare: %.1f $%n", getPassengerName(), getPickup(), getDestination(),getDistanceKm(), getPricePerKm(), getDurationMin(), getPricePerMinute(), passengerCount, calculateFare());
    }
}
