import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a word: ");
            String word = input.nextLine();

            
            System.out.println("Enter another word: ");
            String anotherWord = input.nextLine();

            if(word.equals(anotherWord)){
                System.out.println("They are equal!");
            }
            else{
                System.out.println("They are not equal!");
            }
        }
    }
}
