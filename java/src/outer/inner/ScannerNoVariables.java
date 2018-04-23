package outer.inner;

import java.util.Scanner;

public class ScannerNoVariables {
    public void run() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Give me a word! ");
        keyboard.next();

        System.out.print("Give me a second word! ");
        keyboard.next();

        System.out.print("Great, now your favorite number? ");
        keyboard.nextInt();

        System.out.print("And your second-favorite number... ");
        keyboard.nextInt();

        System.out.println("Whew!  Wasn't that fun?");
        System.exit(0);
    }
}
