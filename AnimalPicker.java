import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean validChoice = false;

        while (validChoice == false) { 
            System.out.println("Would you like to see a cat or a dog?");
            String choice = scan.nextLine();

            if (choice.equals("cat")) {
                validChoice = true;
                System.out.println(" |\\__/,|   (`\\\r\n" + //
                                        " |_ _  |.--.) )\r\n" + //
                                        " ( T   )     /\r\n" + //
                                        "(((^_(((/(((_/");
            } else if (choice.equals("dog")) {
                validChoice = true;
                System.out.println("                                  .-.\r\n" + //
                                        "    *\\___________________________()' `-,\r\n" + //
                                        "     (   ______________________   /````\r\n" + //
                                        "     //\\\\                      //\\\\\r\n" + //
                                        "     \"\" \"\"                     \"\" \"\"");
            } else {
                System.out.println("Error: Invalid option given.");
                System.out.println("I'm not sure what that is, but it isn't a cat or a dog...");
            }
        }
    }
}