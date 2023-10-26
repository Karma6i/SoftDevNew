public class position {
    private static final double inchesToMeters = 0.0254;
    private static final double cmToMeters = 0.01;

    private final double meters;

    public static Position fromInches(double inches) {

        double meters = inches * inchesToMeters;
        return new Position(meters);
    }

    public Position(double meters) {
        this.meters = meters;
    }

    public Position(int feet, double inches) {
        this.meters = getMetersFromFeetAndInches(feet, inches);
    }

    public double getMeters() {
        return this.meters;
    }

    public double getInches() {
        return this.meters / inchesToMeters;
    }


    // Newer code

    public Position addTo(double meters) {
        double newMeters = this.meters + meters;
        return new Position(newMeters);
    }

    public Position addTo(int feet, double inches) {
        double newMeters = this.meters + getMetersFromFeetAndInches(feet, inches);
        return new Position(newMeters);
    }

    private double getMetersFromFeetAndInches(int feet, double inches) {
        double inchesFromFeet = 12.0 * feet;
        double totalInches = inchesFromFeet + inches;
        double meters = totalInches * inchesToMeters;
        return meters;
    }

    // Assignment: Create a method with 2 overloads called subtractFrom that returns
    // a new Position object subtracted from meters and one subtracted from feet and inches.

    public Position subtractFrom(double meters) {
        double newMeters = this.meters - meters;
        return new Position(newMeters);
    }

    public Position subtractFrom(int feet, double inches) {
        double newMeters = this.meters - getMetersFromFeetAndInches(feet, inches);
        return new Position(newMeters);
    }
}
