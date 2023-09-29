import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = input.nextLine();

            String newName = (name.toUpperCase());
            System.out.println("Hello " + newName);
    }
}
}
