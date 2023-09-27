import java.util.Arrays;

public class Vector {
    
    private double[] data;
    private int dimension;
    private double magnitude;
    private double angleDegrees;

    public Vector(double...data){
        this.data = data;
        this.dimension = data.length;

        double sumSqs = 0;
        for(int i = 0; i < dimension; i++){
            sumSqs += data[i] * data[i];
        }
        this.magnitude = Math.sqrt(sumSqs);
        Math.atan2(data[1], data[0]);
        double radians;
        double degreees = Math.toDegrees(radians);
        double degrees;
        this.angleDegrees = degrees;
    }
    public double getAngleDeg(){
        return angleDegrees;
    }

    public Vector add(Vector other){
        int thisDimension = this.dimension;
        int otherDimesnion = other.dimension;
        int newDimension = math.max(thisDimension, otherDimension);
        double[] newData = new Double[newDimension];
        for(int i = 0; i < newDimension; i++){

        }
    }

    public Vector(int i, int j) {
    }
    public Vector(int i, int j, int k) {
    }
    public double getMag(){
        return magnitude;
    }

    @Override
    public String toString(){
        return Arrays.toString(this.data);
    }
}
