import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean validChoice = false;

        while (validChoice == false) { 
            System.out.println("Would you like to see a cat or a dog?");
            String choice = scan.nextLine();

            if (choice == "cat") {
                validChoice = true;
                System.out.println("CAT PLACEHOLDER");
            } else if (choice == "dog") {
                validChoice = true;
                System.out.println("DOG PLACEHOLDER");
            } else {
                System.out.println("Error: Invalid option given.");
                System.out.println("I'm not sure what that is, but it isn't a cat or a dog...");
            }
        }
    }
}