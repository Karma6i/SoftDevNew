public class App {
    public static void main(String[] args) throws Exception {

        StringBuilder myStringBuilder = new StringBuilder("Mr.");
        myStringBuilder.append("Armstrong");
        System.out.println(myStringBuilder.capacity());
        myStringBuilder.delete(4, 7);
        System.out.println(myStringBuilder.toString());

    }
}