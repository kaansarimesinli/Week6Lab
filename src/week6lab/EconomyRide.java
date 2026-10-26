package week6lab;

public class EconomyRide extends Ride{
    
    private double pricePerMinute;

    public EconomyRide(String passengerName, String pickup, String destination, double distanceKm, double pricePerKm, int durationMin, double pricePerMinute) {
        super(passengerName, pickup, destination, distanceKm, pricePerKm, durationMin);
        this.pricePerMinute = pricePerMinute;
    }
    
    public double getPricePerMinute() {
        return this.pricePerMinute;
    }
    
    @Override
    public double calculateFare() {
        if((super.calculateFare() + (getDurationMin() * pricePerMinute)) < 50) {
            return 50;
        }
        return super.calculateFare() + (getDurationMin() * pricePerMinute);
    }
    
    @Override
    public String toString() {
        return String.format("Passenger Name: %s, Pickup: %s, Destination: %s, Distance: %.1f KM, Price Per KM: %.1f $, Duration: %d Minute, Price Per Minute: %.1f $, Fare: %.1f $%n", getPassengerName(), getPickup(), getDestination(),getDistanceKm(), getPricePerKm(), getDurationMin(), pricePerMinute, calculateFare());
    }
}
