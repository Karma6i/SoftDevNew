public class App {
    public static void main(String[] args) throws Exception {
        Position xCoordinate = new Position(3.5);
        Position xCoordinate2 = xCoordinate.addTo(-2.5);
        Position xCoordinate3 = xCoordinate.addTo(2, 5);

        Position xCoordinate4 = xCoordinate.subtractFrom(5);
        Position xCoordinate5 = xCoordinate.subtractFrom(2, 5);

        System.out.println("xCoordinate is " + xCoordinate.getMeters() + " meters");
        System.out.println("xCoordinate2 is " + xCoordinate2.getMeters() + " meters");
        System.out.println("xCoordinate3 is " + xCoordinate3.getMeters() + " meters");
        System.out.println("xCoordinate4 is " + xCoordinate4.getMeters() + " from meters");
        System.out.println("xCoordinate5 is " + xCoordinate5.getMetersFromFeetAndInches() + " from feet and inches");
    }
}
