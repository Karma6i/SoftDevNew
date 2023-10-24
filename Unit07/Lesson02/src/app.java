public class app {
    public static void main(String[] args) throws Exception {
        Position xCoordinate = new Position(3.5);
        Position yCoordinate = new Position(-3.7);
        Position zCoordinate = Position.frominches(13.5);


        System.out.println("xCoordinate is " + xCoordinate.getMeters() + " meters. ");
        System.out.println("xCoordinate is " + xCoordinate.getInches() + " inches. ");


        System.out.println("yCoordinate is " + yCoordinate.getMeters() + " inches. ");
        System.out.println("yCoordinate is " + yCoordinate.getInches() + " inches. ");

        System.out.println("zCoordinate is " + zCoordinate.getMeters() + " meters. ");
        System.out.println("zCoordinate is " + zCoordinate.getInches() + " inches. ");

        System.out.println("The conversion factor for inches to meters is " + Position.inchesToMeters);


    }
}
