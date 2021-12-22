package HomeTask;

import java.util.Scanner;

public class CreateBurger {

    public static final int STARTING_PRICE = 50;

    public static void hello() {
        boolean isRepeatAction = true;

        while (isRepeatAction) {
            System.out.print("You are welcomed by the burger constructor. Burger price - " + STARTING_PRICE + "$." +
                    "\nWould you like to get a burger? (Enter: yes or not) ");

            String answer = getInput();

            if (answer.equals("yes")) {
                makingBurger();
                isRepeatAction = false;
            } else if (answer.equals("not")) {
                System.out.println("Thank you, come again.");
                isRepeatAction = false;
            }
        }
    }

    public static void makingBurger() {
        boolean isRepeatAction = true;
        Burger burger = new Burger(STARTING_PRICE);

        while (isRepeatAction) {
            System.out.print("Would you like to add ingredients? (Enter: yes or not) ");
            String answer = getInput();

            if (answer.equals("yes")) {
                String code = selectIngredient();

                switch (code) {
                    case "1" -> burger.addIngredients(Ingredients.SAUCE);
                    case "2" -> burger.addIngredients(Ingredients.CHEESE);
                    case "3" -> burger.addIngredients(Ingredients.CUTLET);
                    default -> {
                    }
                }

            } else if (answer.equals("not")) {
                issueOfInvoice(burger);
                isRepeatAction = false;
            }
        }
    }

    public static void issueOfInvoice(Burger burger) {
        if (burger == null) {
            System.out.println("Oops, we lost your burger =(");
        } else {
            System.out.println("Burger price: " + STARTING_PRICE + "$");

            if (burger.getAdditionalIngredients().size() > 0) {
                System.out.println("Additional ingredients:");
                for (Ingredients ingredients : burger.getAdditionalIngredients()) {
                    System.out.println(ingredients + " - " + ingredients.price + "$");
                }
            }
            System.out.println("Total price: " + burger.getPrice() + "$. Thanks for your purchase!");
        }
    }

    private static String getInput() {
        Scanner scannerAnswer = new Scanner(System.in);
        return scannerAnswer.next();
    }

    private static String selectIngredient() {
        System.out.println("Enter the number to select an ingredient:");

        for (Ingredients ingredients : Ingredients.values()) {
            System.out.println("#" + ingredients.code + " => " + ingredients + " - " + ingredients.price + "$");
        }
        return getInput();
    }
}
