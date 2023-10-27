public class App {
    public static void main(String[] args) throws Exception {
        Position xCoordinate = new Position(3.5);
        Position xCoordinate2 = xCoordinate.addTo(2.5, UnitType.Meters);
        Position xCoordinate3 = xCoordinate.addTo(5, 8);
        Position xCoordinate4 = xCoordinate.addTo(4, 9);
        Position xCoordinate5 = xCoordinate.addTo(5,0);
        Position xCoordinate6 = xCoordinate.addTo(5,3);

        System.out.println("xCoordinate is " + xCoordinate.get(UnitType.Centimeters) + " " + UnitType.Centimeters.getAbbreviation());
        System.out.println("xCoordinate2 is " + xCoordinate2.get(UnitType.Meters) + " " + UnitType.Meters.getAbbreviation());
        System.out.println("xCoordinate3 is " + xCoordinate3.get(UnitType.Inches) + " " + UnitType.Inches.getAbbreviation());
        System.out.println("xCoordinate4 is " + xCoordinate4.get(UnitType.Miles) + " " + UnitType.Miles.getAbbreviation());
        System.out.println("xCoordinate5 is " + xCoordinate5.get(UnitType.AU) + " " + UnitType.AU.getAbbreviation());
        System.out.println("xCoordinate6 is " + xCoordinate6.get(UnitType.LightYears) + " " + UnitType.LightYears.getAbbreviation());
    }
}
