package week6lab;

import java.util.ArrayList;

public class Week6Lab {

    public static void main(String[] args) {
        
        ArrayList<Ride> rides = new ArrayList<>();
        rides.add(new Ride("Dol Dol", "Talas", "Melikgazi", -5, 56, 12));
        rides.add(new EconomyRide("Del Del", "Talas", "Melikgazi", 15, 56, 12, 2));
        rides.add(new PremiumRide("Dil Dil", "Talas", "Melikgazi", 4, 10, 3, 6 , 6));
        rides.add(new SharedRide("Dul Dul", "Talas", "Melikgazi", 20, -6, 12, 7, 5));
        
        System.out.println("");
        
        for(Ride r : rides) {
            System.out.println(r);
        }
    }

}
