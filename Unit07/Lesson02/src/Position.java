public class Position {

    private static final double feetToMeters = 0.3048;
    private static final double inchesToMeters = 0.0254; //hardcoded value made universal to the class by "static"

    private double meters;

    public static Position fromInches(double inches){ //inches to meters conversion
        double meters = inches * inchesToMeters;

        return new Position(meters);
    }

    public Position(){
        this.meters = 0.0;
    }

    public Position(double meters){ //constructor
        this.meters = meters;
    }

    public double getMeters(){ //method
        return this.meters;
    }

    public double getInches(){ //converting method of meters to inches
        return this.meters / inchesToMeters;
    }

    public Position(int feet, double inches){
        double inchesFromFeet = 12.0 * feet;
        double totalInches = inchesFromFeet + inches;
        double meters = totalInches * inchesToMeters;
        this.meters = meters;
    }



//assignment: method. converting decimal feet to meters


    public static private Position fromFeet(double feet){
        double meters = feet * feetToMeters;

        return new Position(meters);
    }



    public double getMeters(){
        return this.meters;
    }

    public double getInches(){
        return this.meters / inchesToMeters;
    }

}
