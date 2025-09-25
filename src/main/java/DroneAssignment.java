// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class DroneAssignment {
    public static void main(String[] args) {
        // Initial drone values
        double altitude = 150.7;
        double battery = 87.3;
        int photos = 0;
        
        System.out.println("=== Drone Flight Simulation ===");
        System.out.println("Initial Status:");
        System.out.println("Altitude: " + altitude + " meters");
        System.out.println("Battery: " + battery + "%");
        System.out.println("Photos: " + photos);
        System.out.println();
        
        // TODO: Part 1 - Casting
        // Cast altitude (double) to int called displayAltitude
        int displayAltitude = (int) altitude;
        System.out.println("Display Altitude: "+displayAltitude);

        // Cast battery (double) to int called batteryRounded
        int batteryRounded = (int) battery;
        System.out.println("Battery Rounded: " + batteryRounded);
        System.out.println();

        // Print them to check your work (optional)
        
        // TODO: Part 2 - Compound Assignment Operators

        // Altitude: Drone climbs 20 meters
        displayAltitude+=20;
        System.out.println("After climbing 20m: " + displayAltitude);
        // Battery: Battery drains 15%
        batteryRounded*=85;
        batteryRounded/=100;
        System.out.println("Battery: "+batteryRounded);
        // Photos: Drone takes 3 photos
        photos += 3;
        System.out.println("After taking photos: " + photos);
        // Altitude: Drone descends to half its current altitude
        displayAltitude/=2;
        System.out.println("After halving altitude: " + displayAltitude);
        // use modulo to calculate storage slots used on photos to calculate storage slots used
        int slotsUsed = photos % 4;

        // Display "Photos: " + photos
        System.out.println("Photos: " + photos);
        // Display "Storage slots used: " + photos + " out of 4"
        System.out.println("Storage slots used: " + photos + " out of 4");
    }
}
