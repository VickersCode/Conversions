import java.util.Scanner;

/**
 * Program will ask user for a distance in meters.
 * 
 * User will be given the following options:
 *  1. Convert to kilometers
 *  2. Convert to inches
 *  3. Convert to feet
 *  4. Quit the program
 */

public class Conversions {
    public static void main(String[] args) {
        
        // Holds the users choice in the menu
        int choice = 0;

        // Create scanner object and ask user for distance
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a distance in meters:");
        String input = scan.nextLine();
        float meters = Float.parseFloat(input);

        // Loop keeps the program running until the user picks option 4
        while (!(choice == 4)) {
            menu();
            input = scan.nextLine();
            choice = Integer.parseInt(input);

            switch (choice) {
                case 1:
                    showKilometers(meters);
                    break;
                case 2:
                    showInches(meters);
                    break;
                case 3:
                    showFeet(meters);
                    break;
                case 4:
                    continue;
                default:
                    System.out.println("Incorrect value.");
            }
        }

        scan.close();
    }

    public static void menu() {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }

    public static void showKilometers(float meters) {
        float kilometers = (float) (meters * 0.001);
        System.out.println(meters + " meters is " + kilometers + " kilometers.");
    }

    public static void showInches(float meters) {
        float inches = (float) (meters * 39.37);
        System.out.println(meters + " meters is " + inches + " inches.");
    }

    public static void showFeet(float meters) {
        float feet = (float) (meters * 3.281);
        System.out.println(meters + " meters is " + feet + " feet.");
    }

}
