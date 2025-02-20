import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to see a cat or a dog?");
        String choice = scan.nextLine();

        if (choice == "cat") {
            System.out.println("CAT PLACEHOLDER");
        } else if (choice == "dog") {
            System.out.println("DOG PLACEHOLDR");
        } else {
            System.out.println("I'm not sure what that is, but it isn't a cat or a dog...");
        }
    }
}