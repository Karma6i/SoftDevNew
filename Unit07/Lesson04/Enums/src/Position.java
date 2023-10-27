public class Position {

    private final double meters;

    public Position(double meters){
        this.meters = meters;
    }

    public Position(double value, UnitType unitType) {
        this.meters = value * unitType.getConversionFactor();
    }

    public Position(int feet, double inches) {
        this.meters = getMetersFromFeetAndInches(feet, inches);
    }

    public double get(UnitType unitType){ //do sth similar to this for assign
        return this.meters / unitType.getConversionFactor();
    }

    public Position addTo(double value, UnitType unitType) {
        double newMeters = this.meters + value * unitType.getConversionFactor();
        return new Position(newMeters);
    }

    public Position addTo(int feet, double inches) {
        double newMeters = this.meters + getMetersFromFeetAndInches(feet, inches);
        return new Position(newMeters);
    }

    private double getMetersFromFeetAndInches(int feet, double inches) {
        double inchesFromFeet = 12.0 * feet;
        double totalInches = inchesFromFeet + inches;
        double meters = totalInches * UnitType.Inches.getConversionFactor();
        return meters;
    }

}