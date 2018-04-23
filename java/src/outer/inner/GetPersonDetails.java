package outer.inner;

import java.util.Scanner;

public class GetPersonDetails {
    public void run() {

        Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
        String fullName;
        String height;
        String weight;

        System.out.print("What is your name? ");
        fullName = keyboard.next();

        System.out.print("How tall you are? ");
        height = keyboard.next();

        System.out.print("How much do you weight? ");
        weight = keyboard.next();

        System.out.println("\n\nThank you " + fullName + ", your height is " + height + ", and weight is " + weight);
    }
}
