import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean validChoice = false;

        while (validChoice == false) { 
            System.out.println("Would you like to see a cat, a dog, or a FISH?... or bob?");
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
            } else if (choice.equals("fish")) {
                validChoice = true;
                System.out.println("                          .\r\n" + //
                                        "                          A       ;\r\n" + //
                                        "                |   ,--,-/ \\---,-/|  ,\r\n" + //
                                        "               _|\\,'. /|      /|   `/|-.\r\n" + //
                                        "           \\`.'    /|      ,            `;.\r\n" + //
                                        "          ,'\\   A     A         A   A _ /| `.;\r\n" + //
                                        "        ,/  _              A       _  / _   /|  ;\r\n" + //
                                        "       /\\  / \\   ,  ,           A  /    /     `/|\r\n" + //
                                        "      /_| | _ \\         ,     ,             ,/  \\\r\n" + //
                                        "     // | |/ `.\\  ,-      ,       ,   ,/ ,/      \\/\r\n" + //
                                        "     / @| |@  / /'   \\  \\      ,              >  /|    ,--.\r\n" + //
                                        "    |\\_/   \\_/ /      |  |           ,  ,/        \\  ./' __:..\r\n" + //
                                        "    |  __ __  |       |  | .--.  ,         >  >   |-'   /     `\r\n" + //
                                        "  ,/| /  '  \\ |       |  |     \\      ,           |    /\r\n" + //
                                        " /  |<--.__,->|       |  | .    `.        >  >    /   (\r\n" + //
                                        "/_,' \\\\  ^  /  \\     /  /   `.    >--            /^\\   |\r\n" + //
                                        "      \\\\___/    \\   /  /      \\__'     \\   \\   \\/   \\  |\r\n" + //
                                        "       `.   |/          ,  ,                  /`\\    \\  )\r\n" + //
                                        "         \\  '  |/    ,       V    \\          /        `-\\\r\n" + //
                                        "          `|/  '  V      V           \\    \\.'            \\_\r\n" + //
                                        "           '`-.       V       V        \\./'\\\r\n" + //
                                        "               `|/-.      \\ /   \\ /,---`\\         kat\r\n" + //
                                        "                /   `._____V_____V'\r\n" + //
                                        "                           '     '");
                System.out.println("goofy fish");
            } else if (choice.equals("bob")) {
                System.out.println("    .--..--..--..--..--..--.\n    .\' \\  (`._   (_)     _   \\\n  .\'    |  \'._)         (_)  |\n  \\ _.\')\\      .----..---.   /\n  |(_.\'  |    /    .-\\-.  \\  |\n  \\     0|    |   ( O| O) | o|\n   |  _  |  .--.____.\'._.-.  |\n   \\ (_) | o         -` .-`  |\n    |    \\   |`-._ _ _ _ _\\ /\n    \\    |   |  `. |_||_|   |\n    | o  |    \\_      \\     |     -.   .-.\n    |.-.  \\     `--..-\'   O |     `.`-\' .\'\n  _.\'  .\' |     `-.-\'      /-.__   \' .-\'\n.\' `-.` \'.|=\'=.=\'=.=\'=.=\'=|._/_ `-\'.\'\n`-._  `.  |________/\\_____|    `-.\'\n   .\'   ).| \'=\' \'=\'\\/ \'=\' |\n   `._.`  \'---------------\'\n           //___\\   //___\\\n             ||       ||\n             ||_.-.   ||_.-.\n            (_.--__) (_.--__)");
            }else {
                System.out.println("Error: Invalid option given.");
                System.out.println("I'm not sure what that is, but it isn't a cat or a dog...");
            }
        }
    }
}