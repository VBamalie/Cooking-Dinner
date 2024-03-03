
/*Molly Von Behren
 * Advanced Java
 * COP 2805C- 86399
 * March 3, 2024
 */
import java.util.*;

public class CookingDinner {
    public static void main(String[] args) throws Exception {
        System.out.println("Molly Von Behren\n" +
                "Advanced Java\n" +
                "COP 2805C- 86399\n" +
                "March 3, 2024\n");
        Scanner input = new Scanner(System.in);// instantiate user input

        for (int i = 0; i < 3; i++) {// prompts the user 3 times to showcase our three classes
            System.out.println("Smells good! What is cooking?\n" +
                    "Either: \n" +
                    "1: BBQ\n" +
                    "2: Stew\n" +
                    "3: Thanksgiving dinner\n");

            try {
                switch (input.nextInt()) {
                    case 1:
                        cookBackyardBBQ(input);// method that creates and prints a backyard bbq
                        break;
                    case 2:
                        cookStew(input);// method that creates and prints a hearty stew
                        break;
                    case 3: // there are no further prompts for thanksgiving so I instantiate the
                            // thankgiving object here instead of creating a method for it
                        ThanksgivingDinner dinner = new ThanksgivingDinner();
                        System.out.println("\n" + dinner.cook(dinner.getFoodType()) + "\n");
                        break;
                    default:// error handling
                        System.out.println("\nInvalid input! Please enter 1, 2, or 3\n");
                        i--;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input type. Please enter 1, 2, or 3.\n");//
                input.nextLine();// clears out invalid input
                i--;// clears out this invalid response from the loop
            }
        }
        input.close();
    }// end main

    public static void cookStew(Scanner input) {

        System.out.println("\nHow are you cooking your stew?\n" +
                "Either: \n" +
                "1: Stovetop\n" +
                "2: Crockpot\n");
        HeartyStew dinner = new HeartyStew();// creates new hearty stew object
        try {
            switch (input.nextInt()) {// this input sets the cook type to the predefined stovetop or crockpot
                case 1:
                    dinner.setCookType(1);// choice: Stovetop
                    System.out.println("\n" + dinner.cook(dinner.getFoodType())+ "\n");// prints out what the user is cooking
                    break;
                case 2:
                    dinner.setCookType(2);// choice Crockpot
                    System.out.println("\n" + dinner.cook(dinner.getFoodType())+ "\n");// prints out what the user is cooking
                    break;
                default:// error handling
                    System.out.println("\nInvalid input! Please enter 1 or 2\n");
                    cookStew(input);// brings us back to the top of the method if they don't answer correctly
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("\nInvalid input type. Please enter 1, 2, or 3.\n");
            input.nextLine();// clears out invalid input
            cookStew(input);// brings us back to the top of the method if they don't answer correctly
        }
    }// end cookStew()

    public static void cookBackyardBBQ(Scanner input) {
        System.out.println("\nHow are you barbecuing?\n" +
                "Either: \n" +
                "1: Charcoal\n" +
                "2: Propane Grill\n");
        BackyardBBQ dinner = new BackyardBBQ();// creates a new bbq object
        try {
            switch (input.nextInt()) {// this input sets the cook type to the predefined charcoal or propane grill
                case 1:
                    dinner.setCookType(1);// choice charcoal
                    System.out.println("\n" + dinner.cook(dinner.getFoodType())+ "\n");// prints out what the user is cooking
                    break;
                case 2:
                    dinner.setCookType(2);// choice propane grill
                    System.out.println("\n" + dinner.cook(dinner.getFoodType())+ "\n");// prints out what the user is cooking
                    break;
                default:// error handling
                    System.out.println("\nInvalid input! Please enter 1 or 2\n");
                    cookBackyardBBQ(input);// brings us back to the top of the method if they don't answer correctly
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("\nInvalid input type. Please enter 1, 2, or 3.\n");
            input.nextLine();// clears out invalid input
            cookBackyardBBQ(input);// brings us back to the top of the method if they don't answer correctly
        }
    }// end cookBackyardBBq
}
