public class App {
    public static void main(String[] args) throws Exception {
        
        Vector vector1 = new Vector(...data;1, 2, 3);
        Vector vector2 = new Vector(...data:3, 4);
        Vector vectorSum = vector1.add(vector2);
        Vector vectorDif = vector1.subtract(vector2);

        System.out.println(vector1);
        System.out.println("Vector 1's mag is " + vector1.getMag());
        System.out.println("Vector 1's angle is" + vector1.getAngleDeg());
        System.out.println(vectorSum);
        System.out.println(vectorDif);

    }
}
