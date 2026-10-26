package week6lab;

public class PremiumRide extends Ride{
    
    private double comfortFee;
    private double surgeMultiplier;

    public PremiumRide(String passengerName, String pickup, String destination, double distanceKm, double pricePerKm, int durationMin, double comfortFee, double surgeMultiplier) {
        super(passengerName, pickup, destination, distanceKm, pricePerKm, durationMin);
        this.comfortFee = comfortFee;
        if(surgeMultiplier < 1 || surgeMultiplier > 3) {
            System.out.println("WARNING: Surge Multiplier must be between 1.0 and 3.0!");
            this.surgeMultiplier = 1;
        }else {
            this.surgeMultiplier = surgeMultiplier;
        }
    }
    
    @Override
    public double calculateFare() {
        return (super.calculateFare() + comfortFee) * surgeMultiplier;
    }
    
    @Override
    public String toString() {
        return String.format("Passenger Name: %s, Pickup: %s, Destination: %s, Distance: %.1f KM, Price Per KM: %.1f $, Duration: %d Minute, Comfort Fee: %.1f $, Surge Multiplier: %.1f, Fare: %.1f $%n", getPassengerName(), getPickup(), getDestination(),getDistanceKm(), getPricePerKm(), getDurationMin(), comfortFee, surgeMultiplier, calculateFare());
    }
}
